package com.example.app_01_2022_04_06

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spnSexo = findViewById<Spinner>(R.id.spnSexo)
        val txtIdade = findViewById<EditText>(R.id.txtIdade)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        spnSexo.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listOf("Masculino", "Feminino")
        )

        btnCalcular.setOnClickListener {
            val sexo = spnSexo.selectedItem as String
            val idade = txtIdade.text.toString().toInt()
            var resultado = 0
            if(sexo == "Masculino"){
                resultado = 65 - idade
            }else{
                resultado = 60 - idade
            }
            txtResultado.text = "Faltam $resultado anos para se aposentar"
        }
    }
}