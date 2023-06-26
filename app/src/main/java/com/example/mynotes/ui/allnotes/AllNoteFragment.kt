package com.example.mynotes.ui.allnotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mynotes.R
import com.example.mynotes.ui.adapter.ListNoteAdapter
import com.example.mynotes.databinding.FragmentAllNotesBinding
import com.example.mynotes.model.Note
import com.example.mynotes.ui.login.LogInFragment

class AllNoteFragment : Fragment() {

    private var binding: FragmentAllNotesBinding? = null
    private val viewModel: AllNoteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllNotesBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.run {
            noteList.observe(viewLifecycleOwner) {
                setList(it)
            }
            getAllNotes()
        }
        binding?.allNotesLogout?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, LogInFragment())
                .commit()
        }
    }

    private fun setList(list: ArrayList<Note>) {
        binding?.noteRecyclerView?.run {
            if (adapter == null) {
                adapter = ListNoteAdapter()
                layoutManager = LinearLayoutManager(requireContext())
            }
            (adapter as? ListNoteAdapter)?.submitList(list)
            adapter?.notifyDataSetChanged()
        }
    }
}

