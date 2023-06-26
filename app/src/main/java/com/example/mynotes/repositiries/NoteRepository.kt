package com.example.mynotes.repositiries

import com.example.mynotes.db.NoteDataBase
import com.example.mynotes.model.Note
import com.example.mynotes.model.entity.NoteEntity

class NoteRepository {
    fun getAllNotes(): ArrayList<Note> {
        return (NoteDataBase.noteDao?.getAllNote()?.map {
            Note(
                it.title,
                it.message,
                it.date
            )
        } as? ArrayList<Note>) ?: arrayListOf()
    }

    fun getNoteByTitle(title: String): Note? =
        NoteDataBase.listNote.find {
            it.title == title
        }

    fun addNote(note: Note) : Boolean {
        NoteDataBase.noteDao?.insertNote(
            NoteEntity(
                id = 0,
                note.title,
                note.message,
                note.date
            )
        )
        return true
    }

    fun removeNote(note: Note) = NoteDataBase.listNote.remove(note)
}