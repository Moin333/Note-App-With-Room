package com.example.noteappwithroom

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class NoteViewModel(private val dao: NoteDao) : ViewModel() {

    private val _filteredNotes = MutableStateFlow<List<Note>>(emptyList())
    val filteredNotes: StateFlow<List<Note>> = _filteredNotes

    init {
        // Initialize the state with all notes when the ViewModel is first created
        viewModelScope.launch {
            dao.getAllNotes().collectLatest { notes ->
                _filteredNotes.value = notes
            }
        }
    }

    fun addOrUpdateNote(note: Note) {
        viewModelScope.launch {
            if (note.id == 0) {
                dao.insert(note)
            } else {
                dao.update(note)
            }
        }
    }

    fun deleteNote(note: Note) {
        viewModelScope.launch {
            dao.delete(note)
        }
    }

    fun searchNotes(query: String) {
        viewModelScope.launch {
            if (query.isEmpty()) {
                dao.getAllNotes().collectLatest { notes ->
                    _filteredNotes.value = notes
                }
            } else {
                dao.searchNotes(query).collectLatest { filteredNotes ->
                    _filteredNotes.value = filteredNotes
                }
            }
        }
    }
}
