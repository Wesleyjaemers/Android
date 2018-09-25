package com.example.vdabcursist.mini_project_android

import android.app.Application

class App: Application() {
    companion object {
        lateinit var instance: App
    }

    init {
        instance = this
    }
}