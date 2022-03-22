package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ContaTelefone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conta_telefone)

        var CalculTelBtn = findViewById<Button>(R.id.CalcBtn)
        CalculTelBtn.setOnClickListener { view: View? ->

            //Prof, tentamos de tudo, mas sempre crashava o resulConta. Colocamos a lógica das contas, porem não conseguimos printar na outra tela... botao de voltar está ai!

//            var txtAssi = findViewById<EditText>(R.id.idAssinatura)
//            var assinatura = txtAssi.text.toString().toDouble() //textView.text=""
//
//            var txtMLocal = findViewById<EditText>(R.id.idMinLocal)
//            var local = txtMLocal.text.toString().toDouble()
//
//            var txtMCelular = findViewById<EditText>(R.id.idMinCelular)
//            var celular = txtMCelular.text.toString().toDouble()
//
//            var multiLocal: Double = local * 0.04
//            var multiCelular: Double = celular * 0.20
//
//            var somaTotal: Double = assinatura + multiCelular + multiLocal
//
//            var respostaAss = "A assinatura é: $assinatura"

            var intentCalcResul = Intent(this, ResulConta::class.java)
//            intentCalcResul.putExtra("respostaAss", respostaAss)
            startActivity(intentCalcResul)
        }
    }
}
