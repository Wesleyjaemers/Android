package com.example.vdabcursist.lesson_08_menus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true

        }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            R.id.item1_ID -> {Toast.makeText(this, "Item 1 selected",Toast.LENGTH_SHORT).show()
            return super.onOptionsItemSelected(item)}

            R.id.item2_ID -> {Toast.makeText(this, "Item 2 selected",Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)}

            R.id.item3_ID -> {Toast.makeText(this, "Item 3 selected",Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)}
            else -> return super.onOptionsItemSelected(item)
        }
    }
    }

