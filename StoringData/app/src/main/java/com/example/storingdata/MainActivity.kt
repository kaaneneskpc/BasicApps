package com.example.storingdata

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.storingdata.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    var preferences : String ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //SharedPreferences initialize
        sharedPreferences = this.getSharedPreferences("com.example.storingdata",MODE_PRIVATE)
        preferences = sharedPreferences.getString("data","0")
        if(preferences=="0"){
            binding.textView.text = "Your Data:"
        }
        else{
            binding.textView.text = "Your Data : $preferences"
        }
        binding.buttonSave.setOnClickListener {

            val myData=binding.editText.text.toString()
            if(myData!=null){
                sharedPreferences.edit().putString("data",myData).apply()
                binding.textView.text = "Your Data : " + myData
            }

        }
        binding.buttonDelete.setOnClickListener {
            preferences = sharedPreferences.getString("data","0")
            if(preferences !="0"){
                sharedPreferences.edit().remove("data").apply()
                binding.textView.text="Your Data : "
            }
        }
    }
}