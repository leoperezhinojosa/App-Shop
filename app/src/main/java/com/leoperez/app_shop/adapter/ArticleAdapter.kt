package com.leoperez.app_shop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_shop.R
import com.leoperez.app_shop.models.Article

// Adaptador de la lista de articulos
class ArticleAdapter(
    private val articles: List<Article>,
    private val deleteOnClick: (Int) -> Unit,
    private val updateOnClick: (Int) -> Unit,
    private val createOnClick: (Int) -> Unit
    ) : RecyclerView.Adapter<ArticleViewHolder>() {

    // Crear Views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layoutArticle = R.layout.itemlist_cardview
        return ArticleViewHolder(
            layoutInflater.inflate(layoutArticle, parent, false),
            deleteOnClick,
            updateOnClick,
            createOnClick
        )
    }

    // Pintar los objetos en Views
    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.render(articles[position], position)
    }

    // Tamaño de la lista de articulos
    override fun getItemCount(): Int = articles.size
}
