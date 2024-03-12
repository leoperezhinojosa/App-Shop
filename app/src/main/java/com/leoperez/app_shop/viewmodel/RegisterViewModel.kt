package com.leoperez.app_shop.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leoperez.app_shop.model.User

class RegisterViewModel : ViewModel() {

    // Encapsulamiento de la variable users en un MutableLiveData (irá cambiando su valor)
    private val users = MutableLiveData<List<User>>()  // Usuarios registrados

    // Función que registra un usuario si no lo encuentra, y lo asigna al listado de usuarios
    fun register(email: String, pass: String, name: String, id: Int, admin: Boolean): User? {
        val usersList = users.value ?: listOf()

        // Si el email ya existe en la lista de usuarios, no se registra
        for (user in usersList) if (user.email == email) return null

        // Creación de un nuevo usuario
        val currentUser = User(email, pass, 0, false)
        // Asignación del valor de currentUser a users
        val currentUsers = users.value ?: listOf()
        users.postValue(currentUsers + currentUser)
        return currentUser
    }
}