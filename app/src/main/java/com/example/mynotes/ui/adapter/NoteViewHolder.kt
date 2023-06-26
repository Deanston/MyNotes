package com.example.mynotes.ui.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mynotes.databinding.NoteItemBinding
import com.example.mynotes.model.Note

class NoteViewHolder(private val binding: NoteItemBinding) : ViewHolder(binding.root) {

    fun bind(note: Note) {
        binding.run {
            noteItemTitle.text = note.title
            noteItemMessage.text = note.message
            noteItemDate.text = note.date.toString()
        }


    }
}
