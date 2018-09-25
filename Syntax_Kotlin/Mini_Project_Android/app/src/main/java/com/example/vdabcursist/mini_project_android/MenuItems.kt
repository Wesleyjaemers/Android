package com.example.vdabcursist.mini_project_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

open class MenuItems: AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        var x: Intent? = null

        when (item?.itemId) {

            R.id.menu_home -> {
                x = Intent(this, MainMenu::class.java)
                startActivity(x)
                return super.onOptionsItemSelected(item)
            }
            R.id.menu_change -> {
                x = Intent(this, Login::class.java)
                startActivity(x)
                return super.onOptionsItemSelected(item)
            }
            R.id.menu_lists -> {
                x = Intent(this, Lists::class.java)
                startActivity(x)
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
