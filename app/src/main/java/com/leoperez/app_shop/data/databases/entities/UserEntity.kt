package com.leoperez.app_shop.data.databases.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val name: Int = 0,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "pass") val pass: String,
)