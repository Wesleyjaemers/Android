package com.example.vdabcursist.android_09_shared_preferences

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val PREF_Name="myPrefs"
    var myPref:SharedPreferences?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save_ID.setOnClickListener{
            myPref=getSharedPreferences(PREF_Name, 0)

            var editor:SharedPreferences.Editor=(myPref as SharedPreferences).edit()

            if (!TextUtils.isEmpty(ptext_firstname_ID.text.toString())){

                editor.putString("message", ptext_firstname_ID.text.toString())

                editor.commit()
            }
            else {
                Toast.makeText(this, "Please enter your first name", Toast.LENGTH_LONG).show()}
            }

            var databack: SharedPreferences = getSharedPreferences(PREF_Name, 0)

        btn_refresh_ID.setOnClickListener{myPref=getSharedPreferences(PREF_Name, 0)
            if(databack.contains("message")){
                tview_result_ID.text=databack.getString("message", "not found")}
            }
        }
    }

