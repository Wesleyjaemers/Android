package com.example.vdabcursist.lesson_07_navigating_between_activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var message = intent.getStringExtra("name")
        hello_message_ID.text = message
    }

    fun go2MainActivitySecond (view:View){
        var home = Intent(this, MainActivity::class.java)
        startActivity(home)
    }
}
