package com.example.vdabcursist.mini_project_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.text.method.PasswordTransformationMethod




class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraintLayout = findViewById(R.id.constraint_layout_ID) as ConstraintLayout
        constraintLayout.setBackgroundResource(R.drawable.background_main)
    }

}

