package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val textSignUp = findViewById<TextView>(R.id.LogInText)

        textSignUp.setOnClickListener() {

            startActivity(Intent(this, LogInActivity::class.java))
        }
    }
}