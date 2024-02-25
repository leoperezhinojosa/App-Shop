package com.leoperez.app_shop.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.leoperez.app_shop.databinding.ItemlistCardviewBinding
import com.leoperez.app_shop.models.Article

class ArticleViewHolder (view: View) : RecyclerView.ViewHolder(view){

    val binding = ItemlistCardviewBinding.bind(view)

    fun render(article: Article) {
        binding.priceArticle.text = article.price.toString()
        binding.trademarkArticle.text = article.trademark
        binding.nameArticle.text = article.name
        Glide.with(binding.imageCard.context).load(article.image).into(binding.imageCard)
    }
}