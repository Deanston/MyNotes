package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val textOnboarding = findViewById<TextView>(R.id.SkipUnboardingButton)

        textOnboarding.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}