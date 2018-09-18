package com.example.vdabcursist.toast_androidatc_lesson7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClicked (view: View){
        val toast=Toast.makeText(this,application.getString(R.string.app_name),Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 0)
        toast.show()
    }

    override fun onStart () {
        super.onStart()
        Toast.makeText(this, "Welkom bij de app", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy (){
        super.onDestroy()
        Toast.makeText(this, "Het einde van de app", Toast.LENGTH_SHORT).show()
    }

}
