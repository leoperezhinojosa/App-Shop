package com.leoperez.app_shop.model

data class Article (
    // Atributos
    var ref: String,
    var name: String,
    var trademark: String,
    var image: String,
    var price: Double,
    var unit: Int
) {
    // ToString
    override fun toString(): String {
        return "-'$name' (Rf: $ref), Marca: '$trademark', " +
                "Precio: $price €, Imagen: '$image', Cantidad: " + unit + " -"
    }
}