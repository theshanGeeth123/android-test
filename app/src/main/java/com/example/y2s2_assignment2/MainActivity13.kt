package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main13)

        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener(){

            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        val image1 = findViewById<ImageView>(R.id.imageView1)

        image1.setOnClickListener(){

            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

    }
}