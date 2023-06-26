package com.example.mynotes.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "note")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    @ColumnInfo("title")
    val title: String?,
    @ColumnInfo("message")
    val message: String?,
    @ColumnInfo("date")
    val date: Date?
)