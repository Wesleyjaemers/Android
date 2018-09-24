package com.example.vdabcursist.mini_project_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View

class MenuItems: AppCompatActivity() {


    fun goToHome (view: View){
        var x = Intent(this, MainMenu::class.java)
        startActivity(x)
    }
}