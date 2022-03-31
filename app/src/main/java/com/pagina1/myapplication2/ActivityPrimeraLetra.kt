package com.pagina1.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ActivityPrimeraLetra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera_letra)

        //1 asociar elementos activity con layout
        val etPalabra=findViewById<EditText>(R.id.etIngresePalabra)
        val btnExtrarTexto=findViewById<Button>(R.id.btnExtrarTexto)

        //2 habilita acciones y obtener valores de caja de texto

        btnExtrarTexto.setOnClickListener {
            val primeraLetra=etPalabra.text[0]
            Toast.makeText(this, "La Primera Letra es: $primeraLetra", Toast.LENGTH_SHORT).show()

             val ultimaletra=etPalabra.text
                for (letra in ultimaletra.substring(0))
                Toast.makeText(this, "La ultima letra es:$letra", Toast.LENGTH_SHORT).show()

        }
    }
}





