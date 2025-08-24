package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)

        val signupbutton = findViewById<Button>(R.id.button2)

        signupbutton.setOnClickListener(){

            val intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }

        val loginBtn = findViewById<TextView>(R.id.textView4)

        loginBtn.setOnClickListener(){

            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)

        }

    }
}