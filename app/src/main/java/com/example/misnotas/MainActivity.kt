package com.example.misnotas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var buttonSumar: Button
    lateinit var buttonEditar: Button
//    private lateinit var binding:ActivityMainBinding

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSumar = findViewById(R.id.btnAgregar)
        buttonSumar.setOnClickListener {
           val intent: Intent = Intent(this, Agregar:: class.java)
            startActivity(intent)
        }

        buttonEditar = findViewById(R.id.btnEditar)
        buttonEditar.setOnClickListener {
            val intent2: Intent = Intent(this, Editar:: class.java)
            startActivity(intent2)
        }

        val arrayAdapter: ArrayAdapter<*>

        val notas = mutableListOf("Tareas","vida","holi")
        val notasDatos = findViewById<ListView>(R.id.notasDatos)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, notas)
        notasDatos.adapter = arrayAdapter

        notasDatos.setOnItemClickListener() { parent, view, position, id ->
            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()
        }

  //      binding = ActivityMainBinding.inflate(layoutInflater)
    //    setContentView(binding.root)
    }
}