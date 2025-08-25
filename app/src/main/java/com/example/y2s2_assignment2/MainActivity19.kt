package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main19)


        val image1 = findViewById<ImageView>(R.id.imageView1)

        image1.setOnClickListener(){

            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        val btn1 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener(){

            val intent = Intent(this, MainActivity20::class.java)
            startActivity(intent)
        }


    }
}