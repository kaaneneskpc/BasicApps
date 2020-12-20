package com.example.intentapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener {
         val intent= Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("username",editTextName.text.toString())
            intent.putExtra("number",editTextNumber.text.toString())
         startActivity(intent)
        }
        Log.e("create","On Create called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("resume","On Resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("pause","On Pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("stop","On Stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("destroy","On Destroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("restart","On Restart called")
    }
}