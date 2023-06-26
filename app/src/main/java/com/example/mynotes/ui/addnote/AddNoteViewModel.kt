package com.example.mynotes.ui.addnote

import androidx.lifecycle.ViewModel
import com.example.mynotes.model.Note
import com.example.mynotes.repositiries.NoteRepository

class AddNoteViewModel: ViewModel() {

    private val noteRepository = NoteRepository()

    fun addNote(note: Note){
        noteRepository.addNote(note)
    }
}