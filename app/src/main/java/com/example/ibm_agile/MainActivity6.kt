package com.example.ibm_agile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.Toolbar
import android.view.View
import kotlin.random.Random

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }

    public fun ok1(view: View) {
        var i = Intent(this, com.example.ibm_agile.MainActivity7::class.java)
        startActivity(i)
        finish()
    }

    public fun ng1(view: View) {
        var i = Intent(this, com.example.ibm_agile.MainActivity::class.java)
        startActivity(i)
        finish()
    }
}