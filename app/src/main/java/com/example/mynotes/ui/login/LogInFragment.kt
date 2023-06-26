package com.example.mynotes.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentLogInBinding
import com.example.mynotes.ui.BottomNavigationFragment
import com.example.mynotes.ui.signup.SignUpFragment

class LogInFragment : Fragment() {

    private var binding: FragmentLogInBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.ReturnSignUpText?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, SignUpFragment())
                .commit()
        }
        binding?.LogInButton?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, BottomNavigationFragment())
                .commit()
        }
    }
}
