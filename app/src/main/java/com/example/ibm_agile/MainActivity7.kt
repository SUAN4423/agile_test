package com.example.ibm_agile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.Toolbar
import android.view.View
import kotlin.random.Random

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val handler = Handler()
        handler.postDelayed(runnable, Random.nextLong(5000L) + 1500L)
    }

    private val runnable = Runnable {
        if (Random.nextBoolean()) {
            var i = Intent(applicationContext, com.example.ibm_agile.MainActivity8::class.java)
            startActivity(i)
            finish()
        } else {
            var i = Intent(applicationContext, com.example.ibm_agile.MainActivity9::class.java)
            startActivity(i)
            finish()
        }
    }
}