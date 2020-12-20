package com.example.intentapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username =intent.getStringExtra("username")
        val number =intent.getStringExtra("number")
        usernameText.text = "Username :"+ username
        numberText.text = "Number :"+number

    }
}