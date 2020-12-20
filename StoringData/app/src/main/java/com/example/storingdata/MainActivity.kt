package com.example.storingdata

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    var preferences : String ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //SharedPreferences initialize
        sharedPreferences = this.getSharedPreferences("com.example.storingdata",MODE_PRIVATE)
        preferences = sharedPreferences.getString("data","0")
        if(preferences=="0"){
            textView.text = "Your Data:"
        }
        else{
            textView.text = "Your Data : $preferences"
        }
        buttonSave.setOnClickListener {

            val myData=editText.text.toString()
            if(myData!=null){
                sharedPreferences.edit().putString("data",myData).apply()
                textView.text = "Your Data : " + myData
            }

        }
        buttonDelete.setOnClickListener {
            preferences = sharedPreferences.getString("data","0")
            if(preferences !="0"){
                sharedPreferences.edit().remove("data").apply()
                textView.text="Your Data : "
            }
        }
    }
}