package com.example.meuprojetinhoarrasobiblioteca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
        val btnMenu4 = findViewById<Button>(R.id.voltarmenu4)
        btnMenu4.setOnClickListener {
            // Toast.makeText(this, "Você clicou no cadastro de usuário", Toast.LENGTH_LONG).show()
            val intent = Intent (this,Bibliotecaactivity::class.java)
            startActivity(intent)

        }
        val listaLivros = listOf(
            Livro("Dom Casmurro","Machado de Assis", R.drawable.domcasmurro),
            Livro("Jogos Vorazes","Suzanne Collins", R.drawable.jogosvorazes),
            Livro("1984","George Orwell",R.drawable.mil984),
            Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", R.drawable.harry_potter_pedra),
            Livro("Revolução dos Bichos", "George Orwell", R.drawable.revolucao_bichos),
            Livro("O Auto da Barca do Inferno", "Gil Vicente", R.drawable.barca_inferno),
            Livro("Memórias Póstumas", "Machado de Assis", R.drawable.memorias_postumas),
            Livro("O Retrato de Dorian Gray", "Oscar Wilde", R.drawable.retrato_dorian),
            Livro("The Picture of Dorian Gray", "Oscar Wilde", R.drawable.picture_dorian),
            Livro("O Processo", "Franz Kafka", R.drawable.o_processo),
            Livro("Harry Potter e a Câmara Secreta", "J.K. Rowling", R.drawable.harry_potter_camara),
            Livro("Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", R.drawable.harry_potter_azkaban),
            Livro("Harry Potter e as Relíquias da Morte", "J.K. Rowling", R.drawable.harry_potter_reliquias),
            Livro("Morte Súbita", "J.K. Rowling", R.drawable.morte_subita)
        )

        recyclerViewLivros = findViewById(R.id.recyclerViewLivros)
        recyclerViewLivros.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewLivros.adapter = LivroAdapter(listaLivros)

        val listalivros2 = listOf(
            Livro("Grande Sertão: Veredas", "João Guimarães Rosa", R.drawable.grande_sertao),
            Livro("O Primo Basílio", "José Maria de Eça de Queirós", R.drawable.o_primo_basilio),
            Livro("A Moreninha", "Joaquim Manuel de Macedo", R.drawable.a_moreninha),
            Livro("Vidas Secas", "Graciliano Ramos", R.drawable.vidas_secas),
            Livro("O Cortiço", "Aluísio Azevedo", R.drawable.o_cortico),
            Livro("Macunaíma", "Mário de Andrade", R.drawable.macunaima),
            Livro("A Hora da Estrela", "Clarice Lispector", R.drawable.a_hora_da_estrela),
            Livro("O Alienista", "Machado de Assis", R.drawable.o_alienista),
            Livro("Iracema", "José de Alencar", R.drawable.iracema),
            Livro("Senhora", "José de Alencar", R.drawable.senhora),
            Livro("O Guarani", "José de Alencar", R.drawable.o_guarani),
            Livro("Capitães da Areia", "Jorge Amado", R.drawable.capitaes_da_areia),
            Livro("Gabriela, Cravo e Canela", "Jorge Amado", R.drawable.gabriela_cravo),
            Livro("Quincas Borba", "Machado de Assis", R.drawable.quincas_borba),
            Livro("Felicidade Clandestina", "Clarice Lispector", R.drawable.felicidade_clandestina),
            Livro("Sagarana", "João Guimarães Rosa", R.drawable.sagarana),
            Livro("O Menino no Espelho", "Fernando Sabino", R.drawable.o_menino_no_espelho),
            Livro("A Paixão Segundo G.H.", "Clarice Lispector", R.drawable.a_paixao_segundo_gh)
        )

        recyclerViewLivros = findViewById(R.id.recyclerViewMaisLivros)
        recyclerViewLivros.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewLivros.adapter = LivroAdapter(listalivros2)
    }
}
