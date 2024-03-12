package com.leoperez.app_shop.retrofit

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    /*
    1.- Hilt creará una sola instancia de Retrofit.
    2.- A partir de la instancia de Retrofit, devolverá una
    única instancia del Servicio.
    */

    private const val URL_BASE_RETROFIT = "http://10.0.2.2/api/endp/"

    val loginService: LoginService by lazy {
        Retrofit.Builder()
            .baseUrl(URL_BASE_RETROFIT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LoginService::class.java)
    }

    val registerService: RegisterService by lazy {
        Retrofit.Builder()
            .baseUrl(URL_BASE_RETROFIT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RegisterService::class.java)
    }

    val getArticleService: GetArticleService by lazy {
        Retrofit.Builder()
            .baseUrl(URL_BASE_RETROFIT)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GetArticleService::class.java)
    }
}