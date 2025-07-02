package com.example.meuprojetinhoarrasobiblioteca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaLivrosActivity2 : AppCompatActivity() {

    private lateinit var recyclerViewLivros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_livros2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listaLivros = listOf(
            Livro("Dom Casmurro","Machado de Assis", R.drawable.domcasmurro),
            Livro("Jogos Vorazes","Suzanne Collins", R.drawable.jogosvorazes),
            Livro("1984","George Orwell",R.drawable.mil984)
        )

        recyclerViewLivros = findViewById(R.id.recyclerViewLivros)
        recyclerViewLivros.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewLivros.adapter = LivroAdapter(listaLivros)
    }
}
