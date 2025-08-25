package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.interpolator.view.animation.FastOutSlowInInterpolator

class MainActivity : AppCompatActivity() {

    private val ease = FastOutSlowInInterpolator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val logo = findViewById<ImageView>(R.id.imageView4)
        val title = findViewById<TextView>(R.id.textView)
        val getStarted = findViewById<Button>(R.id.button)

        // --- initial states (hidden) ---
        logo.apply {
            alpha = 0f
            scaleX = 0.9f
            scaleY = 0.9f
        }
        title.apply {
            alpha = 0f
            translationY = dp(20f)
        }
        getStarted.apply {
            alpha = 0f
            translationY = dp(28f)
            scaleX = 0.98f
            scaleY = 0.98f
        }

        // --- play animations (staggered) ---
        // Logo: fade + gentle scale in
        logo.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .setDuration(700)
            .setInterpolator(ease)
            .withEndAction {
                // Text: slide up + fade
                title.animate()
                    .alpha(1f)
                    .translationY(0f)
                    .setDuration(600)
                    .setInterpolator(ease)
                    .withEndAction {
                        // Button: slide up + fade, then a subtle one-time pulse
                        getStarted.animate()
                            .alpha(1f)
                            .translationY(0f)
                            .setDuration(600)
                            .setInterpolator(ease)
                            .withEndAction {
                                getStarted.animate()
                                    .scaleX(1f)
                                    .scaleY(1f)
                                    .setDuration(180)
                                    .setInterpolator(ease)
                                    .start()
                            }
                            .start()
                    }
                    .start()
            }
            .start()

        // Click → next screen
        getStarted.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    private fun dp(value: Float): Float =
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, resources.displayMetrics)
}
