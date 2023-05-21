package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val button = findViewById<Button>(R.id.SplashButton)

        button.setOnClickListener {
            startActivity(Intent(this, OnboardingActivity::class.java))
        }

        val text = findViewById<TextView>(R.id.SplashLogInText)

        text.setOnClickListener {
            startActivity(Intent(this, LogInActivity::class.java))
        }
    }
}
