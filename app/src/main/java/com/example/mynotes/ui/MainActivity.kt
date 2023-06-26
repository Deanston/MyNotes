package com.example.mynotes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynotes.R
import com.example.mynotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SplashFragment())
            .commit()
    }
}