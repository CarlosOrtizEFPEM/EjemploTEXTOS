package com.pagina1.myapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityLongitud : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_longitud)

        // 1 asociar elementos activity con los layou (vistas)
        val etIngresoTexto1=findViewById<EditText>(R.id.etIngresoTexto1)
        val etIngresoTexto2=findViewById<EditText>(R.id.etIngresoTexto2)
        val etIngresoTexto3=findViewById<EditText>(R.id.etIngresoTexto3)
        val btnCalculoLongitud=findViewById<Button>(R.id.btnCalculoLongitud)

        //2 habiliatar acciones y obtener valores de cajasde textos y
        //realizar operacionaes y mostrar resultados
        btnCalculoLongitud.setOnClickListener {
            //val cantidadLetras1 = (etIngresoTexto1.length()-1)
            //val final =cantidadLetras1.toChar(cantidadLetras1)
           // Toast.makeText(this, "Numero de letras son, $final  ", Toast.LENGTH_SHORT).show()

            //val cantidadLetras2 = etIngresoTexto2.length()
            //Toast.makeText(this, "Numero de letras son, $cantidadLetras2  ", Toast.LENGTH_SHORT).show()
            //val cantidadLetras3 = etIngresoTexto3.length()
            //Toast.makeText(this, "Numero de letras son, $cantidadLetras3  ", Toast.LENGTH_SHORT).show()

            val sumaTextos=etIngresoTexto1.length()+etIngresoTexto2.length()+etIngresoTexto3.length()
            Toast.makeText(this, "Numero de letras total, $sumaTextos  ", Toast.LENGTH_SHORT).show()
       }


    }
}