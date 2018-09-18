package com.example.vdabcursist.lesson_08_notifications

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun courseUpdate (view: View){
        val id = "my_channel_01"

        val name = getString(R.string.abc_action_bar_home_description)
        val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val description = getString(R.string.abc_action_bar_home_description)
        val importance = NotificationManager.IMPORTANCE_HIGH
        val mChannel = NotificationChannel(id, name, importance)

        mChannel.description = description
        mChannel.enableLights(true)

        mChannel.lightColor = Color.RED
        mChannel.enableVibration(true)
        mNotificationManager.createNotificationChannel(mChannel)

        val CHANNEL_ID = "my_channel_01"

        val mBuilder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentTitle("Android ATC Notification")
                .setContentText("Sick notification")

        val resultIntent = Intent(this, ResultActivity::class.java)

        val stackBuilder= TaskStackBuilder.create(this)

        stackBuilder.addNextIntent(resultIntent)
        val resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
        mBuilder.setContentIntent(resultPendingIntent)

        mNotificationManager.notify(1, mBuilder.build())

    }
}
