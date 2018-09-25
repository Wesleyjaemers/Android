package com.example.vdabcursist.mini_project_android

import android.os.Bundle

class Register : MenuItems() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    private val userDao = UserDao()


}
