package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val resultView = findViewById<TextView>(R.id.resultView)

        rollButton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress) + 1
            resultView.text = rand.toString()

        }
    }
}
