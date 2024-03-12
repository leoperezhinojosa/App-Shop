package com.leoperez.app_shop.retrofit

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header

interface GetArticleService {
    @GET("article")
    suspend fun getArticle(@Body getArticle: RequestGetArticle,
                           @Header(value = "api-key") token: String): Response<ResponseGetArticle>
}