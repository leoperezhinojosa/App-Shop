package com.leoperez.app_shop.model

data class User(
    // Atributos
    var email: String,
    var pass: String,
    var id: Int,
    val admin: Boolean,
) {
    // ToString
    override fun toString(): String {
        return "- Email: $email, Contraseña: $pass, ID: $id" +
                if (admin) " (Administrador)" else " (Cliente)"
    }
}