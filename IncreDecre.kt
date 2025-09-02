package com.example.incredecre

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var Cantidad: EditText = findViewById(R.id.Cantidad)
        var IncreButton: Button = findViewById(R.id.IncreButton)
        var DismiButton: Button = findViewById(R.id.DismiButton)

        IncreButton.setOnClickListener {
            var cantidadActual = Cantidad.text.toString().toIntOrNull() ?: 0
            var nuevaCantidad = ++cantidadActual +1
            Cantidad.setText(nuevaCantidad.toString())
        }

        DismiButton.setOnClickListener {
            var cantidadActual = Cantidad.text.toString().toIntOrNull() ?: 0
            var nuevaCantidad = -- cantidadActual -1
            Cantidad.setText(nuevaCantidad.toString())
        }
    }
}
