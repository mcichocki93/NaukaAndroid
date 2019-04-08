package com.example.marcin.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText4)
        val message = editText4.text.toString()
        //val intent = Intent(this, DispalyMessageActivity::class.java).apply {
           // putExtra(EXTRA_MESSAGE, message)
       // }
       // startActivity(intent)
       // val intent = Intent(Intent.ACTION_SEND).apply {
          //  setType("*/*")
        //    intent.putExtra(Intent.EXTRA_TEXT, message)
      //  }
        //Rozdział 3
        val sendIntent : Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooserTitle = getString(R.string.chooser)
        val chosenIntent : Intent = Intent.createChooser(sendIntent, chooserTitle)
        startActivity(chosenIntent)
    }

    fun findBeer(view: View){
        val intent = Intent(this, FindBeerActivity::class.java)
        startActivity(intent)
    }

    fun onClickStoper(view: View){
        val intent = Intent(this, StopwatchActivity::class.java)
        startActivity(intent)
    }
    fun onClickWorkout(view: View){
        val intent = Intent(this, WorkoutActivity::class.java)
        startActivity(intent)
    }


}
