package com.leoperez.app_shop.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_shop.R
import com.leoperez.app_shop.models.Article

class ArticleViewHolder (view: View) : RecyclerView.ViewHolder(view){

    val name = view.findViewById<TextView>(R.id.name_article)
    val trademark = view.findViewById<TextView>(R.id.trademark_article)
    val price = view.findViewById<TextView>(R.id.price_article)
    val image = view.findViewById<ImageView>(R.id.image_card)
    fun render(article: Article) {
        price.text = article.price.toString()
        trademark.text = article.trademark
        name.text = article.name
    }
}