package com.example.ibm_agile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.Toolbar
import android.view.View
import kotlin.random.Random

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)
        val handler = Handler()
        handler.postDelayed(runnable, 3000L)
    }

    private val runnable = Runnable {
        var i = Intent(applicationContext, com.example.ibm_agile.MainActivity::class.java)
        startActivity(i)
        finish()
    }
}