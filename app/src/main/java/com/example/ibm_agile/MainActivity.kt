package com.example.ibm_agile

import android.app.Notification
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
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
    }

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
            val builder = NotificationCompat.Builder(this)
            builder.setSmallIcon(R.mipmap.ic_launcher_round)
            builder.setContentTitle("席を譲ってほしい人がいます")
            builder.setDefaults(Notification.DEFAULT_SOUND)
            builder.setWhen(System.currentTimeMillis())
            val manager = NotificationManagerCompat.from(applicationContext)
            manager.notify(0, builder.build())
//            var i = Intent(applicationContext, com.example.ibm_agile.MainActivity4::class.java)
//            startActivity(i)
//            finish()
        }
    }
}