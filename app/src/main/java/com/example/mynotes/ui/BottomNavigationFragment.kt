package com.example.mynotes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentBottomNavigationBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class BottomNavigationFragment : Fragment() {
    private var binding: FragmentBottomNavigationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomNavigationBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parentFragmentManager.beginTransaction()
            .replace(R.id.bottomNavigationContainer, AllNoteFragment())
            .commit()

        val bottomNavigation = view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        parentFragmentManager.beginTransaction()
                            .replace(R.id.bottomNavigationContainer, AllNoteFragment())
                            .addToBackStack(null)
                            .commit()
                        return@setOnItemSelectedListener true
                    }

                    R.id.search -> {
                        parentFragmentManager.beginTransaction()
                            .replace(R.id.bottomNavigationContainer, SearchFragment())
                            .addToBackStack(null)
                            .commit()
                        return@setOnItemSelectedListener true
                    }

                    R.id.addNote -> {
                        parentFragmentManager.beginTransaction()
                            .replace(R.id.bottomNavigationContainer, AddNoteFragment())
                            .addToBackStack(null)
                            .commit()
                        return@setOnItemSelectedListener true
                    }

                    R.id.profile -> {
                        parentFragmentManager.beginTransaction()
                            .replace(R.id.bottomNavigationContainer, ProfileFragment())
                            .addToBackStack(null)
                            .commit()
                        return@setOnItemSelectedListener true
                    }

                    else -> return@setOnItemSelectedListener true
                }
            }
    }
}
