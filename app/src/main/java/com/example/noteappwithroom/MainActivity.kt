package com.example.noteappwithroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.noteappwithroom.ui.theme.NoteAppWithRoomTheme

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dao = NoteDatabase.getDatabase(applicationContext).noteDao()
        viewModel = ViewModelProvider(this, NoteViewModelFactory(dao))[NoteViewModel::class.java]
        setContent {
            NoteAppWithRoomTheme {
                NotesApp(viewModel)
            }
        }
    }
}

