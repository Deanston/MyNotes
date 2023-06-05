package com.example.mynotes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var binding: FragmentSplashBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.SplashButton?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, OnboardingFragment())
                .commit()
        }

        binding?.SplashLogInText?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, LogInFragment())
                .commit()
        }
    }
}
