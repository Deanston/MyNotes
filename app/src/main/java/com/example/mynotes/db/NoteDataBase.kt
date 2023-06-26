package com.example.mynotes.db

import android.content.Context
import androidx.room.Room
import com.example.mynotes.model.Note

object NoteDataBase {

    var noteDao: NoteDao? = null

    private var noteDataBase: AppDataBase? = null
    fun initNDB(context: Context) {
        val noteDataBase = Room.databaseBuilder(context, AppDataBase::class.java, "note-data-base")
            .allowMainThreadQueries()
            .build()
        noteDao = noteDataBase.getNoteDao()
    }

    val listNote = arrayListOf<Note>()

}
