package com.example.datos_entre_activitis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var textInputNombre:TextInputLayout
    lateinit var editTestApellido:EditText
    lateinit var btnEnviar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputNombre = findViewById(R.id.TILNombre)
        editTestApellido = findViewById(R.id.etApellido)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val apellido = editTestApellido.text.toString()
            val nombre = textInputNombre.editText!!.text.toString()


            val i = Intent(this,SegundaActivity::class.java)

            i.putExtra("name",nombre)
            i.putExtra("lastname",apellido)

            startActivity(i)
        }
    }
}