package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResulConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resul_conta)

        val lbAssinatura = findViewById<TextView>(R.id.respostaId)
        lbAssinatura.text = intent.getStringExtra("respostaAss")
    }
}