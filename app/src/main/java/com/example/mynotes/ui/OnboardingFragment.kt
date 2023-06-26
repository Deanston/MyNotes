package com.example.mynotes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.mynotes.OnboardingScreens.OnboardingScreen
import com.example.mynotes.OnboardingScreens.OnboardingScreen1
import com.example.mynotes.OnboardingScreens.OnboardingScreen2
import com.example.mynotes.OnboardingScreens.VpAdapter
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentOnboardingBinding
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator


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


        val fragmentList = arrayListOf<Fragment>(
            OnboardingScreen(),
            OnboardingScreen1(),
            OnboardingScreen2()
        )
        val adapter = VpAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        val viewPager = view.findViewById<ViewPager2>(R.id.vp2)
        viewPager?.adapter = adapter
        val indicator = view.findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)

        indicator.attachTo(viewPager)
    }
}
