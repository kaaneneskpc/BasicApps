package com.example.warningmessage

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context

        //ActivityContext -> this
        //AppContext -> applicationContext



        Toast.makeText(applicationContext,"Hello,Welcome",Toast.LENGTH_SHORT).show()

        buttonSave.setOnClickListener {

         val alert = AlertDialog.Builder(this@MainActivity)
         alert.setTitle("Save")
         alert.setMessage("Are you sure?")
         alert.setPositiveButton("Yes"){dialog,which ->
             //onClickListener
             Toast.makeText(applicationContext,"Saved",Toast.LENGTH_SHORT).show()
         }
         alert.setNegativeButton("No"){dialog,which ->
             //onClickListener
             Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_SHORT).show()
         }
            alert.show()
        }

    }


}