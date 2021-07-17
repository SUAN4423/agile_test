package com.example.ibm_agile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.Toolbar
import android.view.View
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val handler = Handler()
        handler.postDelayed(runnable, Random.nextInt(5000).toLong())
    }

    private val runnable = Runnable {
        var i = Intent(applicationContext, com.example.ibm_agile.MainActivity3::class.java)
        startActivity(i)
        finish()
    }
}