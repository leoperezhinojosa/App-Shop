package com.leoperez.app_shop.data.databases

import androidx.room.Dao
import androidx.room.Query
import com.leoperez.app_shop.data.databases.entities.UserEntity

@Dao
interface UserDao {

    //@Query("INSERT INTO user VALUES (email, pass, id)")
    //suspend fun insertUser(): UserEntity

    //@Query("DELETE FROM user WHERE id = :id")
    //suspend fun deleteUser(): UserEntity

    //@Query("UPDATE user SET email = :email, pass = :pass WHERE id = :id")
    //suspend fun updateUser(): UserEntity

    //@Query("SELECT * FROM user WHERE id = :id")
    //suspend fun getUser(): UserEntity

    //@Query("SELECT * FROM user")
    //suspend fun getAllUsers(): List<UserEntity>
}