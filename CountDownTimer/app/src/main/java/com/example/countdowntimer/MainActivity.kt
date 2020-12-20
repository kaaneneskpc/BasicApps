package com.example.countdowntimer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                textViewLeft.text="Left : ${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                textViewLeft.text="Left : 0"
            }

        }
    }
}