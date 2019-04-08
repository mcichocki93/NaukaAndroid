package com.example.marcin.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DispalyMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dispaly_message)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textVew = findViewById<TextView>(R.id.textView2).apply {
            text = message
        }

    }
}
