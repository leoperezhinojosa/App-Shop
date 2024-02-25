package com.leoperez.app_shop.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_shop.databinding.ItemlistCardviewBinding
import com.leoperez.app_shop.models.Article

class ArticleViewHolder (
    view: View,
    var deleteOnClick: (Int) -> Unit,
    var updateOnClick: (Int) -> Unit,
    var createOnClick: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {

    // Implementar binding
    private var binding: ItemlistCardviewBinding

    init {
        binding = ItemlistCardviewBinding.bind(view)
    }

    fun render(article: Article, position: Int) {
        binding.nameArticle.text = article.name
        binding.trademarkArticle.text = article.trademark
        binding.priceArticle.text = article.price.toString()

        // Implementar Glide
        // Glide
        //     .with(itemView.context)
        //     .load(article.image)
        //     .centerCrop()
        //     .into(binding.imageCard)

        // setOnClickListener(position)
    }

    private fun setOnClickListener(position: Int) {
        binding.iconDeleteCard.setOnClickListener {
            deleteOnClick(position)
        }

        binding.iconEditCard.setOnClickListener {
            updateOnClick(position)
        }

        binding.iconCreateCard.setOnClickListener {
            createOnClick(position)
        }
    }
}