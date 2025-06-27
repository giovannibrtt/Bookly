package com.example.meuprojetinhoarrasobiblioteca

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LivroAdapter(private val listaLivros: List<Livro>) :
    RecyclerView.Adapter<LivroAdapter.LivroViewHolder>() {

    class LivroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val capaImageView: ImageView = itemView.findViewById(R.id.imgCapaLivro)
        val tituloTextView: TextView = itemView.findViewById(R.id.txtTituloLivro)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LivroViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_livro, parent, false)
        return LivroViewHolder(view)
    }

    override fun onBindViewHolder(holder: LivroViewHolder, position: Int) {
        val livro = listaLivros[position]
        holder.tituloTextView.text = livro.titulo
        holder.capaImageView.setImageResource(livro.imagemResId)
    }

    override fun getItemCount(): Int = listaLivros.size
}