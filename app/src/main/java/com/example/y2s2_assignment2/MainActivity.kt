package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main11) // make sure this matches your XML file name

        // Map each section id to its destination Activity
        val routes: Map<Int, Class<*>> = mapOf(
            R.id.section1 to MainActivity9::class.java,   // Home
            R.id.section2 to MainActivity15::class.java,  // Favourites
            R.id.section3 to MainActivity12::class.java,  // My Cart
            R.id.section4 to MainActivity18::class.java,  // My Profile
            R.id.section5 to MainActivity5::class.java    // Sign Out / other screen
        )

        val clicker = View.OnClickListener { v ->
            routes[v.id]?.let { target ->
                startActivity(Intent(this, target))
            }
        }

        // Attach listeners (all are LinearLayouts in your XML)
        findViewById<LinearLayout>(R.id.section1).setOnClickListener(clicker)
        findViewById<LinearLayout>(R.id.section2).setOnClickListener(clicker)
        findViewById<LinearLayout>(R.id.section3).setOnClickListener(clicker)
        findViewById<LinearLayout>(R.id.section4).setOnClickListener(clicker)
        findViewById<LinearLayout>(R.id.section5).setOnClickListener(clicker)
    }
}
