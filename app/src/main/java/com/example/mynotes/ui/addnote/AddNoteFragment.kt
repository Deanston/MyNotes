package com.example.mynotes.ui.addnote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentAddNoteBinding
import com.example.mynotes.model.Note
import com.example.mynotes.ui.allnotes.AllNoteFragment
import com.example.mynotes.util.getSting
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class AddNoteFragment : Fragment() {
    private var binding: FragmentAddNoteBinding? = null
    private val viewModel: AddNoteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.addNoteButton?.setOnClickListener {

        }

        binding?.addNotesBack?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.bottomNavigationContainer, AllNoteFragment()).commit()
        }

        binding?.addNoteButton?.setOnClickListener {
            addNote()
        }
    }

    private fun addNote() {
        viewModel.addNote(
            Note(
                binding?.addNoteTitleText?.getSting(),
                binding?.addNoteMessageText?.getSting(),
                Date()
            )
        )
        Toast.makeText(requireContext(), "Saved", Toast.LENGTH_LONG).show()
        parentFragmentManager.popBackStack()
    }
}
