package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ContaTelefonicaBtn.setOnClickListener {
            var intentTelefone = Intent(this, ContaTelefone::class.java)
            startActivity(intentTelefone)
        }
        CalculadoraBtn.setOnClickListener {
            var intentCalculadora = Intent(this, Calculadora::class.java)
            startActivity(intentCalculadora)


        }
    }

    fun IntegranteBotao(view:View) {
        val msg = "Bruno Lora\nMatheus Meneguim"
        exibirMensagem("Desenvolvido por:", msg)
    }
    fun exibirMensagem(titulo:String, mensagem:String) {
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("Valeu 10 pelo esforço...", null)
        builder.create().show()
    }

}
