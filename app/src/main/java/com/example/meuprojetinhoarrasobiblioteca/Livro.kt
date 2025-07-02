package com.example.meuprojetinhoarrasobiblioteca

data class Livro(
    val titulo: String,
    val autor: String,
    val imagemResId: Int // ou uma URL se for imagem da internet
)