package com.example.karen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val menux: Button= findViewById(R.id.button)
        menux.setOnClickListener {
            val intent: Intent= Intent(this, menu::class.java)
            startActivity(intent)
        }

    }
}