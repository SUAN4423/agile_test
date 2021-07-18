package com.example.ibm_agile

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.support.v7.widget.SwitchCompat
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Switch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createNotificationChannel()
    }

    private val CHANNEL_ID: String = "IBMagileTestNotification";

    public fun clicked(view: View) {
        var i = Intent(this, com.example.ibm_agile.MainActivity2::class.java)
        startActivity(i)
        finish()
    }

    public fun toggled(view: View) {
        val handler = Handler()
        handler.postDelayed(runnable, Random.nextInt(5000).toLong())
    }

    private val runnable = Runnable {
        if ((findViewById<Switch?>(R.id.isOK) as Switch?)!!.isChecked) {
            val intent = Intent(this, MainActivity6::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

            val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            builder.setSmallIcon(R.mipmap.ic_launcher_round)
            builder.setContentTitle("席ゆずりあい促進アプリ")
            builder.setContentText("席を譲ってほしい人がいます")
            builder.setDefaults(Notification.DEFAULT_SOUND)
            builder.setPriority(NotificationCompat.PRIORITY_DEFAULT)
            builder.setContentIntent(pendingIntent)
            builder.setAutoCancel(true)
            builder.setWhen(System.currentTimeMillis())
            val manager = NotificationManagerCompat.from(applicationContext)
            manager.notify(0, builder.build())
//            var i = Intent(applicationContext, com.example.ibm_agile.MainActivity4::class.java)
//            startActivity(i)
//            finish()
        }
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "席ゆずりあい促進アプリ" //getString(R.string.channel_name)
            val descriptionText = "席を譲ってほしい人がいます" //getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}