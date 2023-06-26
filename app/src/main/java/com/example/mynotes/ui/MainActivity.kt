package com.example.mynotes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynotes.R
import com.example.mynotes.repositiries.SharedPreferenceRepository
import com.example.mynotes.ui.login.LogInFragment
import com.example.mynotes.ui.splash.SplashFragment
import com.example.mynotes.util.replaceFragment

class MainActivity : AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (SharedPreferenceRepository.isFirstOpen()) {
            SharedPreferenceRepository.setIsFirstOpen(false)
            supportFragmentManager.replaceFragment(R.id.container, SplashFragment())
        } else {
            supportFragmentManager.replaceFragment(R.id.container, LogInFragment())
        }
    }
}