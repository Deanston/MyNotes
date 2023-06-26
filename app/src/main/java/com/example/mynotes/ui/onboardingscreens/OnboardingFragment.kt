package com.example.mynotes.ui.onboardingscreens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {
    private var binding: FragmentOnboardingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val fragmentList = arrayListOf(
            OnboardingFragment1(),
            OnboardingFragment2(),
            OnboardingFragment3()
        )
        val adapter = VpAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        val viewPager = binding?.vp2
        viewPager?.adapter = adapter
        val indicator = binding?.wormDotsIndicator

        if (viewPager != null) {
            indicator?.attachTo(viewPager)
        }
    }
}
