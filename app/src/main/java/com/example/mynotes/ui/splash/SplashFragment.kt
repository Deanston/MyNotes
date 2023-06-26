package com.example.mynotes.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentSplashBinding
import com.example.mynotes.repositiries.SharedPreferenceRepository
import com.example.mynotes.ui.login.LogInFragment
import com.example.mynotes.ui.onboardingscreens.OnboardingFragment
import com.example.mynotes.util.replaceFragment

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
            parentFragmentManager.replaceFragment(R.id.container, OnboardingFragment())
        }

        binding?.SplashLogInText?.setOnClickListener {
            parentFragmentManager.replaceFragment(R.id.container, LogInFragment())
        }
    }
}
