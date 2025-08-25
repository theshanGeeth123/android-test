package com.example.y2s2_assignment2

import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ScrollView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity9 : AppCompatActivity() {

    private val animatedOnce = hashSetOf<View>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)

        // ---- your existing navigation ----
        val menu = findViewById<ImageView>(R.id.imageView12)
        menu.setOnClickListener {
            startActivity(Intent(this, MainActivity11::class.java))
        }

        findViewById<ImageView>(R.id.imageView20).setOnClickListener {
            startActivity(Intent(this, MainActivity10::class.java))
        }

        findViewById<ImageView>(R.id.imageView21).setOnClickListener {
            startActivity(Intent(this, MainActivity16::class.java))
        }

        findViewById<ImageView>(R.id.imageView19).setOnClickListener {
            startActivity(Intent(this, MainActivity12::class.java))
        }
        // ----------------------------------

        // ---- reveal-on-scroll wiring ----
        val scrollView = findViewById<ScrollView>(R.id.scrollView)
        val root = findViewById<ViewGroup>(R.id.main)

        prepareTargets(root)

        // initial reveal after layout
        root.viewTreeObserver.addOnGlobalLayoutListener {
            revealVisibleChildren(scrollView, root)
        }
        // reveal while scrolling
        scrollView.viewTreeObserver.addOnScrollChangedListener {
            revealVisibleChildren(scrollView, root)
        }
    }

    private fun prepareTargets(container: ViewGroup) {
        traverse(container) { v ->
            if (v.tag == "reveal") {
                v.alpha = 0f
                v.translationY = 16f * resources.displayMetrics.density
            }
        }
    }

    private fun revealVisibleChildren(scrollView: ScrollView, container: ViewGroup) {
        val visibleRect = Rect()
        scrollView.getHitRect(visibleRect)

        var order = 0
        traverse(container) { v ->
            if (v.tag == "reveal" && v.getLocalVisibleRect(visibleRect) && !animatedOnce.contains(v)) {
                val animRes = if (order % 2 == 0) R.anim.fade_in_up else R.anim.fade_in_left
                val anim = AnimationUtils.loadAnimation(this, animRes)
                anim.startOffset = order * 60L
                v.startAnimation(anim)

                // lock end state
                v.animate().alpha(1f).translationX(0f).translationY(0f).setDuration(0).start()

                animatedOnce.add(v)
                order++
            }
        }
    }

    // non-inline to allow safe recursion
    private fun traverse(container: ViewGroup, block: (View) -> Unit) {
        for (i in 0 until container.childCount) {
            val child = container.getChildAt(i)
            block(child)
            if (child is ViewGroup) traverse(child, block)
        }
    }
}
