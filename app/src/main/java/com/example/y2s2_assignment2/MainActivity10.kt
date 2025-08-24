package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main10)

        val image1 = findViewById<ImageView>(R.id.imageView1)

        image1.setOnClickListener(){

            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        val purchasebtn = findViewById<Button>(R.id.button3)

        purchasebtn.setOnClickListener(){

            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)


        }

        val addToCartButton = findViewById<Button>(R.id.button4)

        // Set click listener
        addToCartButton.setOnClickListener {
            Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show()
        }


    }
}