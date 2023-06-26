package com.example.mynotes.ui.onboardingscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.R
import com.example.mynotes.ui.signup.SignUpFragment
import com.example.mynotes.databinding.FragmentOnboardingscreen2Binding

class OnboardingFragment3 : Fragment() {

    private var binding: FragmentOnboardingscreen2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingscreen2Binding.inflate(inflater, container, false)
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
