package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val textReturnSignUp = findViewById<TextView>(R.id.ReturnSignUpText)

        textReturnSignUp.setOnClickListener() {

            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}