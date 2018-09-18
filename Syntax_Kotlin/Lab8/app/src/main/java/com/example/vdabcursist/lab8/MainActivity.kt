package com.example.vdabcursist.lab8

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val id="my_channel_02"

        val name = getString(R.string.abc_action_bar_home_description)

        val description = getString(R.string.abc_action_bar_home_description)
        val importance = NotificationManager.IMPORTANCE_HIGH
        val mChannel = NotificationChannel(id, name, importance)

        mChannel.description = description
        mChannel.enableLights(true)

        mChannel.lightColor = Color.RED
        mChannel.enableVibration(true)
        mNotificationManager.createNotificationChannel(mChannel)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?):Boolean {
        webview_ID.setWebViewClient(WebViewClient())

        when(item?.itemId){

            R.id.item_courses_ID -> {webview_ID.loadUrl("http://www.androidatc.com")

                val CHANNEL_ID = "my_channel_02"

                val mBuilder = NotificationCompat.Builder(this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.notification_icon_background)
                        .setContentTitle("Android ATC Notification")
                        .setContentText("Check Android ATC New Course")

                val resultIntent = Intent(this, ResultActivity::class.java)

                val stackBuilder = TaskStackBuilder.create(this)

                stackBuilder.addNextIntent(resultIntent)
                val resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
                mBuilder.setContentInfo(resultPendingIntent)
                val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                mNotificationManager.notify(2, mBuilder.build())
                return super.onOptionsItemSelected(item)
            }

            R.id.item_exam_ID -> {webview_ID.loadUrl("http://kamelrechner.eu/en")
            return super.onOptionsItemSelected(item)}

            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun goToWeb (view: View){
        webview_ID.settings.javaScriptEnabled =true
        webview_ID.settings.loadsImagesAutomatically = true
        webview_ID.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

        val url = url_text_ID.text.toString()

        webview_ID.setWebViewClient(WebViewClient())

        webview_ID.loadUrl(url)
    }
}
