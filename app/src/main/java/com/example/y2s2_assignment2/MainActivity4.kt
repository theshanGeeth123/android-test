package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        //Start animation

        val imgBg   = findViewById<ImageView>(R.id.imageView1)
        val imgIcon = findViewById<ImageView>(R.id.imageView2)
        val title   = findViewById<TextView>(R.id.textView1)
        val logo = findViewById<ImageView>(R.id.imageView2)
        val nextBtn = findViewById<Button>(R.id.button1)

        // 2) Load animations (same anim, staggered)
        val anim0 = AnimationUtils.loadAnimation(this, R.anim.animemain2)          // starts now
        val anim1 = AnimationUtils.loadAnimation(this, R.anim.animemain2).apply {  // +120ms
            startOffset = 120
        }
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.animemain2).apply {  // +240ms
            startOffset = 240
        }

        val anim3 = AnimationUtils.loadAnimation(this,R.anim.animemain2).apply {
            startOffset = 270
        }

        val anim4 = AnimationUtils.loadAnimation(this,R.anim.animemain2).apply {
            startOffset = 300
        }

        // 3) Start them (order bottom -> top, tweak if you like)
        imgBg.startAnimation(anim0)
        imgIcon.startAnimation(anim1)
        title.startAnimation(anim2)
//        logo.startAnimation(anim3)
//        nextBtn.startAnimation(anim4)

        //End animation

        nextBtn.setOnClickListener(){

            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)

        }

    }
}