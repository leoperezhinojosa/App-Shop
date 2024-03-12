package com.leoperez.app_shop.retrofit

import com.google.gson.annotations.SerializedName
import com.leoperez.app_shop.model.Article

class ResponseGetArticle (
    val result: String,
    @SerializedName("articles")
    val listArticle: List<Article>
)
