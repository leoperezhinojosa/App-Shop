package com.leoperez.app_shop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_shop.R
import com.leoperez.app_shop.models.Article

class ArticleAdapter(private val articleList: MutableList<Article>) :
    RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ArticleViewHolder(layoutInflater.inflate(R.layout.itemlist_cardview, parent, false))
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val item = articleList[position]
        holder.render(item)
    }

    // Devuelve el número de elementos que hay en la lista
    override fun getItemCount(): Int = articleList.size

}

