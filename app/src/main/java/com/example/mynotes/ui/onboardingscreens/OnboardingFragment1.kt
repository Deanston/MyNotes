package com.example.mynotes.ui.onboardingscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.R
import com.example.mynotes.ui.signup.SignUpFragment
import com.example.mynotes.databinding.FragmentOnboardingscreenBinding

class OnboardingFragment1 : Fragment() {

    private var binding: FragmentOnboardingscreenBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingscreenBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.SkipUnboardingButton?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, SignUpFragment())
                .commit()
        }
    }
}
