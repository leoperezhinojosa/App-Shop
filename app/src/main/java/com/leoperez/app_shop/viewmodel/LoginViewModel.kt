package com.leoperez.app_shop.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leoperez.app_shop.model.User
import com.leoperez.app_shop.model.UserProvider

class LoginViewModel : ViewModel() {

    // Encapsulamiento de la variable users en un MutableLiveData (irá cambiando su valor)
    private val users = MutableLiveData<List<User>>() // Usuarios registrados

    init {
        users.value = UserProvider.getUsers()
    }

    // Función que verifica el login: No se está usando. Cambiar si se usa ViewModel *
//    fun login(email: String, pass: String): User? {
//        val usersList = users.value ?: listOf()
//        for (user in usersList) {
//            // Si el email y la clave coinciden con algún usuario, se devuelve el usuario
//            if ((user.email == email) && (user.pass == pass))
//                return user
//        }
//        return null
//    }
}