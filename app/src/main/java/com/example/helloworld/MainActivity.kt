package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<EditText>(R.id.editTextTextPersonName)
        val output = findViewById<TextView>(R.id.testoSaluto)
        val button = findViewById<Button>(R.id.actionButton)
//        button.setOnClickListener { Toast.makeText(this, // Toast = messaggio "pop-up" mostrato sopra all'activity
//        "ciao bello", Toast.LENGTH_LONG).show() }
        button.setOnClickListener {
            output.text = "Ciao ${input.text}!"
        }
    }
}