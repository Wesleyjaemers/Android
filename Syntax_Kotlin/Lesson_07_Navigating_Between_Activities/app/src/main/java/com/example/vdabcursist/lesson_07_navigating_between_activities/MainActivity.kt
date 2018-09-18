package com.example.vdabcursist.lesson_07_navigating_between_activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun go2SecondActivity (view: View){
        var nav2 = Intent(this, SecondActivity::class.java)
        nav2.putExtra("name",input_firstname_ID.text.toString())
        startActivity(nav2)
    }

    fun go2ThirdActivity (view :View){
        var nav3 = Intent(this, ThirdActivity::class.java)
        startActivity(nav3)
    }

    fun go2FourthActivity (view :View){
        var nav4 = Intent(this, FourthActivity::class.java)
        startActivity(nav4)
    }

}
