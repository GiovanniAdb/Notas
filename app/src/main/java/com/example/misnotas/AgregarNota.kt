package com.example.misnotas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AgregarNota : AppCompatActivity() {

    lateinit var buttonRegresarNota: Button
    lateinit var buttonAgregarNota: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_nota)

        buttonRegresarNota = findViewById(R.id.btnBackNota)
        buttonRegresarNota.setOnClickListener {
            val intentRegresar: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentRegresar)
        }

        buttonAgregarNota = findViewById(R.id.btnAgregarNota)
        buttonAgregarNota.setOnClickListener {
            val intentAgregarNota: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentAgregarNota)
        }

    }
}