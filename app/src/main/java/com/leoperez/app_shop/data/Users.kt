package com.leoperez.app_shop.data

import com.leoperez.app_shop.model.User

object Users {
    val users = mutableListOf<User>()

    init {
        users.add(User("leo.com", "1234", 1, true))
        users.add(User("joaquin.com", "1234", 2, true))
        users.add(User("santi.com", "1234", 3, false))
        users.add(User("alicia.com", "1234", 4, false))
        users.add(User("jose.com", "1234", 5, false))
    }

}