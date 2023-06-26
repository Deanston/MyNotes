package com.example.mynotes.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mynotes.model.entity.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
@TypeConverters(com.example.mynotes.util.TypeConverter::class)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getNoteDao(): NoteDao
}