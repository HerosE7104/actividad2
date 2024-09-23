package com.example.formulario2act

import android.annotation.SuppressLint
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val Nombre = findViewById<AppCompatEditText>(R.id.editTextText)
            val Edad = findViewById<AppCompatEditText>(R.id.editTextText2)
            val Enviar = findViewById<AppCompatButton>(R.id.button)
            Enviar.setOnClickListener{
                val name=Nombre.text.toString()
                val ane =Edad.text.toString()
                if(name.isNotEmpty()){
                    val intent = Intent(this,result_Activity::class.java)
                    intent.putExtra("EXTRA_NAME",name)
                    intent.putExtra("EXTRA_ANE",ane)
                    startActivity(intent)
                }
            }
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
    }


}