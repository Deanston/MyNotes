package com.example.mynotes.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    val title: String?,
    val message: String,
    val date: String
) : Parcelable
