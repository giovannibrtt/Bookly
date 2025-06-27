package com.example.meuprojetinhoarrasobiblioteca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bibliotecaactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bibliotecaactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
         }
        val btnEntrar = findViewById<Button>(R.id.entrar2)
        btnEntrar.setOnClickListener {
            // Toast.makeText(this, "Você clicou no cadastro de usuário", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ListaLivrosActivity2::class.java)
            startActivity(intent)
        }
        val btnCadastrar = findViewById<Button>(R.id.cadastrar)
        btnCadastrar.setOnClickListener {
            // Toast.makeText(this, "Você clicou no cadastro de usuário", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Usuarioactivity::class.java)
            startActivity(intent)
        }

    }
}