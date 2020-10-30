package com.example.singlepageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage() {
        Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show();
    }

}