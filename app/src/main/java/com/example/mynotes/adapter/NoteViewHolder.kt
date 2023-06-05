package com.example.mynotes.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mynotes.R
import com.example.mynotes.model.Note

class NoteViewHolder(private val view: View) : ViewHolder(view) {

    fun bind(note: Note) {
        val title: TextView = view.findViewById(R.id.noteItemTitle)
        title.text = note.title
        val message: TextView = view.findViewById(R.id.noteItemMessage)
        message.text = note.message
        val date: TextView = view.findViewById(R.id.noteItemDate)
        date.text = note.date

    }
}
