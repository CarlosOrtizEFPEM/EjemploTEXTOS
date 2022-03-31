package com.pagina1.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // vincular los activity y con los elementos de la vista //
    val btnLongitud=findViewById<Button>(R.id.btnLongitud)
    val btnExtrarLetra=findViewById<Button>(R.id.btnExtrarLetra)

    //habilitar el evento click para el boton//
    // enlasar los botones del Main
    btnLongitud.setOnClickListener {
        Toast.makeText(this, "Calculo de Longitud de Textos", Toast.LENGTH_SHORT).show()
        //llamar a otras Activity
        val Longitud: Intent = Intent(this,ActivityLongitud::class.java)
        startActivity(Longitud)
        }
   btnExtrarLetra.setOnClickListener {
       Toast.makeText(this, "Extrae 1era.y ultima Letra", Toast.LENGTH_SHORT).show()
       val extraerPalabra:Intent= Intent(this,ActivityPrimeraLetra::class.java  )
       startActivity(extraerPalabra)
        }

    }
}