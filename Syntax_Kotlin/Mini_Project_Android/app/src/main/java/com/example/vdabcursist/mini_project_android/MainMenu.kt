package com.example.vdabcursist.mini_project_android

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenu : MenuItems() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        var dUser: Login ?= null
        tview_display_username_ID.text = dUser?.displayUser

    }

    //Buttons
    fun goToEditList (view: View){
        var x = Intent(this, EditList::class.java)
        startActivity(x)
    }

    fun goToLists (view: View){
        var x = Intent(this, List::class.java)
        startActivity(x)
    }

}
