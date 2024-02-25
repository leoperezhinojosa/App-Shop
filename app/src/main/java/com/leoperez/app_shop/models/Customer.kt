package com.leoperez.app_shop.models

data class Customer (
    // Atributos
    var id: Int,
    var name: String,
    var phone: String,
    var address: String) {

    // Propiedad extra: Lista de la compra (Articulos)
    private var shopping: MutableList<Article> = mutableListOf()

    // ToString
    override fun toString(): String {
        return "- Cliente: ID: $id, Nombre completo: $name, " +
                "Telefono: $phone, Direccion: $address " +
                "\n# Cesta: $shopping"
    }
}