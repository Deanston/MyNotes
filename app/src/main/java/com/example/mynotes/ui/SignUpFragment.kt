package com.example.mynotes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private var binding: FragmentSignUpBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.LogInText?.setOnClickListener() {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, LogInFragment())
                .commit()
        }
        binding?.SignUpBottom?.setOnClickListener() {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, BottomNavigationFragment())
                .commit()
        }
    }
}
