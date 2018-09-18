package com.example.vdabcursist.lesson_07_navigating_between_activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var countryName : Array<String> = arrayOf("Canada", "USA","Mexico", "Columbia", "Malaysia", "Singapore", "Turkey", "Nicaragua", "India", "Italy", "Tunisia", "Chile", "Argentina", "Spain", "Peru" )
        var countryAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryName)
        listview7.adapter = countryAdapter

    }

    fun go2MainActivityThird (view: View){
        var home = Intent(this, MainActivity::class.java)
        startActivity(home)
    }
}

