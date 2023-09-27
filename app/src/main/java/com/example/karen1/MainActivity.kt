package com.example.karen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hola: Button= findViewById(R.id.button1)
        hola.setOnClickListener {
            val intent: Intent= Intent(this, usuario::class.java)
            startActivity(intent)
        }
        val hola1: EditText= findViewById(R.id.ayuda)
        hola1.setOnClickListener {
            val intent: Intent= Intent(this,registro::class.java)
            startActivity(intent)
        }
    }
}