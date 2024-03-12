package com.leoperez.app_shop.retrofit

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("auth")
    suspend fun auth(@Body loginUser: RequestLoginUser): Response<ResponseLogin>
}