package com.sst.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    val colors = listOf(R.color.sst_red, R.color.sst_blue, R.color.sst_grey)
    var currentColor = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentLayout = findViewById<ConstraintLayout>(R.id.parent_constraintLayout)
        val changeColorButton = findViewById<Button>(R.id.change_color_button)

        // Set the current color
        parentLayout.setBackgroundColor(ContextCompat.getColor(this, colors[currentColor]))

        // When the button is clicked, loop through the colors
        changeColorButton.setOnClickListener {
            currentColor = (currentColor + 1) % colors.size
            parentLayout.setBackgroundColor(ContextCompat.getColor(this, colors[currentColor]))
        }
    }
}