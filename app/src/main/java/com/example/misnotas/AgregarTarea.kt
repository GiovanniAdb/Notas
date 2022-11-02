package com.example.misnotas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AgregarTarea : AppCompatActivity() {

    lateinit var buttonRegresarTarea: Button
    lateinit var buttonAgregarTarea: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_tarea)

        buttonRegresarTarea = findViewById(R.id.btnBackTarea)
        buttonRegresarTarea.setOnClickListener {
            val intentRegresarTarea: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentRegresarTarea)
        }

        buttonAgregarTarea = findViewById(R.id.btnGuardarTarea)
        buttonAgregarTarea.setOnClickListener {
            val intentAgregarTarea: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentAgregarTarea)
        }
    }
}