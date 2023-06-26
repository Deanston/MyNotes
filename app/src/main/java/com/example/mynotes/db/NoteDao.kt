package com.example.mynotes.db


import androidx.room.*
import com.example.mynotes.model.entity.NoteEntity

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: NoteEntity)

    @Delete
    fun deleteNote(note: NoteEntity)

    @Query("SELECT * FROM note")
    fun getAllNote(): List<NoteEntity>
}