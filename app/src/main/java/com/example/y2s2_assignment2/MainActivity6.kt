package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)


        val signinbutton = findViewById<Button>(R.id.button2)

        signinbutton.setOnClickListener(){

            val intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }

        val registerBtn = findViewById<TextView>(R.id.textView4)

        registerBtn.setOnClickListener(){

            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }

    }
}