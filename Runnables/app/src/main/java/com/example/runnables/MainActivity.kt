package com.example.runnables

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number=0
    var runnable : Runnable = Runnable { }
    var handler : Handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStart.setOnClickListener {
          number=0
            runnable = object : Runnable {
                override fun run() {
                    number=number+1
                    textView.text ="Time : $number"
                    handler.postDelayed(runnable,1000) //delayed Time
                }
            }
            handler.post(runnable) //runnable start

        }
        buttonStop.setOnClickListener {
           handler.removeCallbacks(runnable)
            number=0
            textView.text ="Time : 0"
        }
    }
}