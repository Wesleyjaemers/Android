package com.example.vdabcursist.mini_project_android

import android.content.Intent
import android.os.Bundle
import android.view.View

class MainMenu : MenuItems() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

    }

    //Buttons
    fun goToCreateList (view: View){
        var x = Intent(this, CreateList::class.java)
        startActivity(x)
    }

    fun goToLists (view: View){
        var x = Intent(this, Lists::class.java)
        startActivity(x)
    }

}
