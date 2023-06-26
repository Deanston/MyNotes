package com.example.mynotes.db

import com.example.mynotes.model.Subscriber
import com.example.mynotes.model.Note

object NoteDataBase {
    private val listSubscribers = arrayListOf<Subscriber>()

    private val list = arrayListOf<Note>()

    fun addNote(note: Note) {
        list.add(note)
        notifySubscribers()
    }

    fun getListNotes() = list

    fun subscribe(s: Subscriber) {
        listSubscribers.add(s)
    }

    fun unsubscribe(s: Subscriber) {
        listSubscribers.remove(s)
    }

    fun notifySubscribers() {
        listSubscribers.forEach {
            it.update()
        }
    }
}
