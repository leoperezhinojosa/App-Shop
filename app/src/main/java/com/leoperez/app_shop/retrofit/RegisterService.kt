package com.leoperez.app_shop.retrofit

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterService {
    @POST("endp/registro")
    suspend fun registro(@Body registerUser: RequestRegisterUser): Response<ResponseRegister>
}