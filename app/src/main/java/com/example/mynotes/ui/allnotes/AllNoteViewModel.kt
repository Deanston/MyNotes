package com.example.mynotes.ui.allnotes


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mynotes.repositiries.NoteRepository

class AllNoteViewModel : ViewModel() {

    val noteList = MutableLiveData<ArrayList<com.example.mynotes.model.Note>>()

private val noteRepository = NoteRepository()

    fun getAllNotes() {
        noteList.value = noteRepository.getAllNotes()
    }

}