package com.leoperez.app_shop.data

import com.leoperez.app_shop.model.Customer

object Customers {
    // Lista de clientes:
    val c1 = Customer(3, "Santiago Ródenas Herrainz", "666444555", "A/Madrid, 40, Jaen")
    val c2 = Customer(4, "Alicia Ruiz Ruz","666888222", ",C/Nueva, 35, Jaen")
    val c3 = Customer(5, "Jose Castillo Castillo ","666111333","C/Real, 2, Jaen")
    val customers : MutableList<Customer> = mutableListOf(c1, c2, c3)
}