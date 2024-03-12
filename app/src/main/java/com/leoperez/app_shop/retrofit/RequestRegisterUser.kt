package com.leoperez.app_shop.retrofit

class RequestRegisterUser (
    val email: String,
    val password: String,
    val name: String,
    val admin: Int,
    val available: Int
)