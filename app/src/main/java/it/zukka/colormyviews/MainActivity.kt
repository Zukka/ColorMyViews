package it.zukka.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {

        val box_one_text = findViewById<TextView>(R.id.box_one_text)
        val box_two_text = findViewById<TextView>(R.id.box_two_text)
        val box_three_text = findViewById<TextView>(R.id.box_three_text)
        val box_four_text = findViewById<TextView>(R.id.box_four_text)
        val box_five_text = findViewById<TextView>(R.id.box_five_text)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)
        val redButton = findViewById<TextView>(R.id.red_button)
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text,
                        box_four_text, box_five_text, redButton, yellowButton, greenButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}