package com.leoperez.app_shop.objects_models

import com.leoperez.app_shop.models.Article

class ArticleProvider {
    companion object {
        val articles = mutableListOf(
            Article(
                "a001", "Patatas, 5kg", "Del Chef",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlCo_0sCGJKltIxe--FsDHBauGe4p_s0Yenw&usqp=CAU",
                6.50, 0
            ),
            Article(
                "a002", "Leche entera, 1l, 6u", "Covap",
                "https://tienda.covap.es/images/thumbnails/600/600/detailed/9/botella-leche-entera-1,5l.jpg",
                10.50, 0
            ),
            Article(
                "a003", "Chocolate 82% Negro", "Valor",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuVmZpI84EPtXXlvDPrV68Dejmzh7hMH4mng&usqp=CAU",
                4.90, 0
            ),
            Article(
                "a004", "Champu, 200ml", "HS classic",
                "https://cdn2.primor.eu/media/catalog/product/cache/8d3aba296f7a18b5251ee30fa5db42b2/0/8/08006540748466_80718481_PRODUCT_IMAGE_IN_PACKAGE_FRONT_CENTER_3000X3000_1_SPANI_d8bd.webp",
                2.70, 0
            ),
            Article(
                "a005", "Detergente, 1.5l", "Ariel",
                "https://media.rourejuni.com/c/product/ariel-liq-regular-368-d-520x520.jpg",
                14.50, 0
            ),
            Article(
                "a006", "Bombones, 200gr", "Nestle",
                "https://m.media-amazon.com/images/I/71Ut6B37C+L._AC_UF894,1000_QL80_.jpg",
                11.70, 0
            ),
            Article(
                "a007", "Vino, 70cl, 6u", "Protos",
                "https://www.vinoseleccion.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/p/r/protos-vs.jpg",
                10.50, 0
            ),
            Article(
                "a008", "Lejia, 5l", "Conejo",
                "https://t1.gstatic.com/images?q=tbn:ANd9GcTCx0SPXptqdn1GFrCQy9qIZ3FZJMVRFhhMyQjncR72bkMr-P6p",
                6.90, 0
            ),
            Article(
                "a009", "Tomate frito, 370ml", "Hero",
                "https://www.latiendahero.es/media/catalog/product/cache/c618c2928eceaf37dee079899c3658fc/h/e/hero__ficticiotomatefritoreceta_casera__tol_1_2_1.png",
                1.90, 0
            ),
            Article(
                "a010", "Pimienta negra, 50gr", "Carmencita",
                "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRojrzcP8wEUxZ9Qlcgs8V1la_DWVV_JYM5SKw3MAmRzA0LNo4E",
                2.50, 0
            )
        )
    }
}