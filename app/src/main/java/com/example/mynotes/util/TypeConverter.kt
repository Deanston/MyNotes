package com.example.mynotes.util

import java.util.*

class TypeConverter {
    @androidx.room.TypeConverter
    fun dateToLong(date: Date): Long {
        return date.time
    }

    @androidx.room.TypeConverter
    fun longToDate(date: Long): Date {
        return Date(date)
    }
}