package com.example.vdabcursist.android_09_external_storage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ex_storage_ID.setOnClickListener{
            val state = Environment.getExternalStorageState()
            if (Environment.MEDIA_MOUNTED.equals(state)|| Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)){
                Toast.makeText(this, "External storage is available to read", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "External storage not available", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
