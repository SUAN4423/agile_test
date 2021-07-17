package com.example.ibm_agile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    public fun yes(view: View) {
        var i = Intent(this, com.example.ibm_agile.MainActivity4::class.java)
        startActivity(i)
        finish()
    }

    public fun no(view: View) {
        var i = Intent(this, com.example.ibm_agile.MainActivity5::class.java)
        startActivity(i)
        finish()
    }
}