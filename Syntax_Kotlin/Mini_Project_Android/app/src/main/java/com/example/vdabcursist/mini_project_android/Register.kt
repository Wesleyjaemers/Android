package com.example.vdabcursist.mini_project_android

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_register.*

class Register : MenuItems() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


    }

    fun onClickRegister(view: View) {
        val regFirstName = input_reg_firstname_ID.text.toString()
        val regLastName = input_reg_lastname_ID.text.toString()
        val regAddress = input_reg_adress_ID.text.toString()
        val regBirthDate = input_reg_date_ID.text.toString()
        val regUsername = input_reg_username_ID.text.toString()
        val regPassword = input_reg_password_ID.text.toString()

        if (!regFirstName.isNullOrEmpty() && !regLastName.isNullOrEmpty() && !regAddress.isNullOrEmpty() && !regBirthDate.isNullOrEmpty() && !regUsername.isNullOrEmpty() && !regPassword.isNullOrEmpty()) {
            if (!checkUsername(regUsername)) {
                userDao.add(Users(null, regFirstName, regLastName, regAddress, regBirthDate, regUsername, regPassword))
                goToLogin()

            } else {
                Toast.makeText(this, "Username not available", Toast.LENGTH_SHORT).show()
            }

        } else {
            Toast.makeText(this, "Please fill in ALL fields", Toast.LENGTH_SHORT).show()
        }
    }

    private val userDao = UserDao()

    fun goToLogin() {
        var x = Intent(this, Login::class.java)
        startActivity(x)
    }

    fun checkUsername (z: String): Boolean {
        if (z == userDao.getUsername(z)) {
            return true
        }
        return false
    }

}