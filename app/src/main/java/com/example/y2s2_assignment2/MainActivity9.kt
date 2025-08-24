package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)

//        val signinbutton = findViewById<ImageView>(R.id.imageView15)
//
//        signinbutton.setOnClickListener(){
//
//            val intent = Intent(this,MainActivity6::class.java)
//            startActivity(intent)
//        }


        val menu = findViewById<ImageView>(R.id.imageView12)

        menu.setOnClickListener(){

            val intent = Intent(this,MainActivity11::class.java)

            startActivity(intent)
        }


        val image1 = findViewById<ImageView>(R.id.imageView20)

        image1.setOnClickListener(){

            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.imageView21)

        image2.setOnClickListener(){

            val intent = Intent(this, MainActivity16::class.java)
            startActivity(intent)
        }



        val image4 = findViewById<ImageView>(R.id.imageView19)

        image4.setOnClickListener(){

            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }



    }
}