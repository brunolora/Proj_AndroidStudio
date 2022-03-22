package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_calculadora.*

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        var CalcularBtn = findViewById<Button>(R.id.CalcularBtn)

        CalcularBtn.setOnClickListener { view: View? ->
            var txtValor1 = findViewById<EditText>(R.id.Valor1txt)
            var Valor1 = txtValor1.text.toString().toDouble()

            var txtValor2 = findViewById<EditText>(R.id.Valor2txt)
            var Valor2 = txtValor2.text.toString().toDouble()

            var resultadoSoma : Double = Valor1 + Valor2
            var resultadoSub : Double = Valor1 - Valor2
            var resultadoMult : Double = Valor1 * Valor2
            var resultadoDiv : Double = Valor1 / Valor2

            if (SomaRB.isChecked) {

                Toast.makeText(this, "O valor da Soma dos valores eh equivalente a $resultadoSoma", Toast.LENGTH_SHORT).show()
            }
            else if (SubtracaoRB.isChecked) {
                Toast.makeText(this, "O valor da Subtracao dos valores eh equivalente a $resultadoSub", Toast.LENGTH_SHORT).show()
            }
            else if (MultiplicacaoRB.isChecked) {
                Toast.makeText(this, "O valor da Multiplicacao dos valores eh equivalente a $resultadoMult", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "O valor da Divisao dos valores eh equivalente a $resultadoDiv", Toast.LENGTH_SHORT).show()
            }


        }
    }


}