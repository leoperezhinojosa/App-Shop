package com.leoperez.app_shop.models

data class User(
    // Atributos
    var email: String,
    var password: String,
    var id: Int,
    val admin: Boolean,
) {
    // ToString
    override fun toString(): String {
        return "- Email: $email, Contraseña: $password, ID: $id" +
                if (admin) " (Administrador)" else " (Cliente)"
    }
}