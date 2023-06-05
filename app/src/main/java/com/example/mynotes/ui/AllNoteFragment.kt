package com.example.mynotes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.model.Subscriber
import com.example.mynotes.adapter.ListNoteAdapter
import com.example.mynotes.databinding.FragmentAllNotesBinding
import com.example.mynotes.db.NoteDataBase

class AllNoteFragment : Fragment(), Subscriber {

    private lateinit var binding: FragmentAllNotesBinding
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllNotesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.allNotesLogout.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, LogInFragment())
                .commit()
        }

        NoteDataBase.subscribe(this)
        recyclerView = view.findViewById(R.id.note_recyclerView)
        recyclerView?.run {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ListNoteAdapter()
            (adapter as? ListNoteAdapter)?.submitList(
                NoteDataBase.getListNotes()
            )
        }
    }

    override fun update() {
        recyclerView?.run {
            if (adapter == null) {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = ListNoteAdapter()
            }
            (adapter as? ListNoteAdapter)?.submitList(
                NoteDataBase.getListNotes()
            )
            adapter?.notifyDataSetChanged()
        }
    }
}
