package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // declaring btn
        val btnClickMe = findViewById<Button>(R.id.myButton)
        val textView =  findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener{
            //storing value of click in diff variable and printing in textView
            timesClicked = timesClicked + 1
            textView.text = timesClicked.toString()
            Toast.makeText(this,"Hey User", Toast.LENGTH_SHORT).show()

        }
    }
}