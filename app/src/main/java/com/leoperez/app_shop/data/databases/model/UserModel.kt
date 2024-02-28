package com.leoperez.app_shop.data.databases.model

import com.google.gson.annotations.SerializedName

data class UserModel ( // Clase de datos para la entidad Usuario
    @SerializedName("email") val email: String,
    @SerializedName("pass") val pass: String,
    @SerializedName("id") val id: Int,
)