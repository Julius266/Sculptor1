package com.example.sculptor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class screen2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val ton: Button = findViewById(R.id.button2)

        ton.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val imview: ImageView = findViewById(R.id.imageButton1)
        imview.setOnClickListener {
            val intent: Intent = Intent(this, screen3:: class.java)
            startActivity(intent)
        }
        val imview2: ImageView = findViewById(R.id.imageButton2)
        imview2.setOnClickListener {
            val intent: Intent = Intent(this, screen4:: class.java)
            startActivity(intent)
        }
        val imview3: ImageView = findViewById(R.id.imageButton3)
        imview3.setOnClickListener {
            val intent: Intent = Intent(this, screen5:: class.java)
            startActivity(intent)
        }


    }
}