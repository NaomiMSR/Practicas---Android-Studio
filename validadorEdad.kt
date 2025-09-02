package com.example.validadoredad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miEdad: EditText = findViewById(R.id.editText)
        val miBoton: Button = findViewById(R.id.button)
        val miResultado: TextView = findViewById(R.id.textView2)

        miBoton.setOnClickListener {
            val numero = miEdad.text.toString().toIntOrNull()

            if (numero == null) miResultado.text = "Ingresa un numero valido"
            else if (numero < 18) miResultado.text = "Eres menor de edad, largo, no puedes entrar!"
            else if (numero == 18) miResultado.text = "Tienes exactamente 18, igual puedes pasar"
            else if (numero > 19 && numero < 65) miResultado.text = "Eres mayor de edad, tu si puedes entrar"
            else if (numero > 65) miResultado.text = "Ya regresele el celular a su nieto"
        }
    }
}
