package com.example.formulario2act

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val Regre =findViewById<AppCompatButton>(R.id.button2)
            val tvResult = findViewById<TextView>(R.id.tvResult)
            val tvResult2 =findViewById<TextView>(R.id.tvResult2)
            val name:String= intent.extras?.getString("EXTRA_NAME").orEmpty()
            val ane:String=intent.extras?.getString("EXTRA_ANE").orEmpty()
            tvResult.text = "Hola $name"
            tvResult2.text="tu edad es $ane"
            Regre.setOnClickListener{
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}