package com.example.vdabcursist.lesson_08_snackbar

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mgSnack (view : View){
        var snackB: Snackbar = Snackbar.make(findViewById(R.id.content),"No Internet Connection !!",Snackbar.LENGTH_LONG).setAction("Retry"){}
        snackB.setActionTextColor(Color.RED)
        snackB.show()
    }
}
