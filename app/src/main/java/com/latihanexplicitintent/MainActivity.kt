package com.latihanexplicitintent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : Activity(), View.OnClickListener {
    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<View>(R.id.button1) as Button
        button!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val explicitIntent = Intent(
            this@MainActivity,
            MainActivity2::class.java
        )
        startActivity(explicitIntent)
    }
}