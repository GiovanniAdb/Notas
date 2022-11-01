package com.example.misnotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonEditar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonEditar = findViewById(R.id.btnEditar)
        buttonEditar.setOnClickListener {
           val intent: Intent = Intent(this, Editar:: class.java)
            startActivity(intent)
        }

    }
}