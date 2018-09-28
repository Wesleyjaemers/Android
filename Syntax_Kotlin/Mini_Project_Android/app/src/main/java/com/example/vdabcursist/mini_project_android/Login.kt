package com.example.vdabcursist.mini_project_android

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class Login : MenuItems() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val constraintLayout = findViewById(R.id.constraint_layout_ID) as ConstraintLayout
        constraintLayout.setBackgroundResource(R.drawable.background_main)
    }

    var displayUser: String ?= null
    private val userDao = UserDao()

    fun checkLogin (usr: String, pw: String): Boolean{
        if (usr == userDao.getUsername(usr) && pw == userDao.getPassword(pw)){
            return true
        }
        return false
    }

    //Buttons

    fun goToRegister (view: View){
        val x = Intent(this, Register::class.java)
        startActivity(x)
    }

    fun onClickLogin (view: View){
        val logUsername: String = input_log_username_ID.text.toString()
        val logPassword: String = input_log_password_ID.text.toString()

        if (checkLogin(logUsername, logPassword)){
            val x = Intent (this, MainMenu::class.java)
            startActivity(x)
            displayUser = logUsername
        }
        else{
            Toast.makeText(this, "Wrong username of password!", Toast.LENGTH_LONG).show()
        }
    }

    fun onClickQuit (View: View){
        finish()
        System.exit(0)
    }

}

