package com.example.vdabcursist.applayout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.second_screen.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToSecondScreen (view: View){
        var intent = Intent(this, second_screen::class.java )
        startActivity(intent)
    }
}
