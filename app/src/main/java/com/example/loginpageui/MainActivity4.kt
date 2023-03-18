package com.example.loginpageui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val done = findViewById<Button>(R.id.donebtn)
        done.setOnClickListener {
            val Intent = Intent(this,mycrophome::class.java)
            startActivity(Intent)
        }
    }
}