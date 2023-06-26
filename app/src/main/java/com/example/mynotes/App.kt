package com.example.mynotes

import android.app.Application
import com.example.mynotes.db.NoteDataBase
import com.example.mynotes.repositiries.SharedPreferenceRepository

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPreferenceRepository.init(applicationContext)
        NoteDataBase.initNDB(applicationContext)
    }
}