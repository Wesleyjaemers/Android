package com.example.vdabcursist.mini_project_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.Menu
import android.view.View


class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val constraintLayout = findViewById(R.id.constraint_layout_ID) as ConstraintLayout
        constraintLayout.setBackgroundResource(R.drawable.background_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    fun goToRegister (view: View){
        var x = Intent(this, Register::class.java)
        startActivity(x)
    }


}

