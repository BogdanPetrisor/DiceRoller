package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rolButton: Button = findViewById(R.id.roll_button)
        rolButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        /*Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show() */
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    @SuppressLint("SetTextI18n")
    fun countUp(view: View) {
        val resultText: TextView = findViewById(R.id.result_text)
        when (resultText.text) {
            "6" -> resultText.text
            "Hello World!" -> resultText.text = "1"
            else -> resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }
    }
}