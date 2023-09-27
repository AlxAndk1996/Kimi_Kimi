package com.example.karen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val hola3: Button = findViewById(R.id.button6)
        hola3.setOnClickListener {
            val intent: Intent = Intent(this, registro2::class.java)
            startActivity(intent)

        }
    }
}