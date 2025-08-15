package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.animation.AnimationUtils


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val getStartedButton = findViewById<Button>(R.id.button)

        val logoImage = findViewById<ImageView>(R.id.imageView4)
        val bounceAnim = AnimationUtils.loadAnimation(this, R.anim.bounce)
        logoImage.startAnimation(bounceAnim)

        // Example: add a click listener
        getStartedButton.setOnClickListener {

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }

    }
}