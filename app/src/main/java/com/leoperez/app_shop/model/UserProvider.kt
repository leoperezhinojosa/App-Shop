package com.leoperez.app_shop.model

class UserProvider {
    // Lista de usuarios
    companion object {
        // Atributos
        private val users: List<User> = listOf(
            User("leo.com", "1234", 1, true),
            User("santi.com", "1234", 2, true),
            User("pepe.com", "1234", 3, false),
            User("maria.com", "1234", 4, false)
        )

        // Método para obtener la lista de usuarios
        fun getUsers(): List<User> {
            return users
        }
    }
}