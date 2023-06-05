package com.example.mynotes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mynotes.R
import com.example.mynotes.databinding.FragmentAddNoteBinding
import com.example.mynotes.db.NoteDataBase
import com.example.mynotes.model.Note
import com.example.mynotes.util.getText
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class AddNoteFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentAddNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addNotesBack.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.bottomNavigationContainer, AllNoteFragment())
                .commit()
        }

        binding.addNoteButton.setOnClickListener {
            val title: String = binding.addNoteTitle.getText()
            val message: String = binding.addNoteMessage.getText()
            val note = Note(title, message, dateText)
            NoteDataBase.addNote(note)
            Toast.makeText(requireContext(), "Saved", Toast.LENGTH_LONG).show()
            parentFragmentManager.popBackStack()

        }
    }

    var currentDate: Date = Date()
    var dateFormat: DateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
    var dateText: String = dateFormat.format(currentDate)
}
