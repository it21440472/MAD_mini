package com.example.loginpageui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageButton:ImageButton=findViewById(R.id.mycropbtnmain)
        imageButton.setOnClickListener{
            startActivity(Intent(this,mycrophome::class.java))


        }
    }
}
