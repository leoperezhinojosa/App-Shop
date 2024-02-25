package com.leoperez.app_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_shop.adapter.ArticleAdapter
import com.leoperez.app_shop.databinding.ActivityMainBinding
import com.leoperez.app_shop.objects_models.Articles.articles

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    initRecyclerView()
}

    private fun initRecyclerView() {
        val recyclerView = binding.listaArticulos
        recyclerView.adapter = ArticleAdapter(
            articles,
            {
                // Eliminar artículo
                articles.removeAt(it)
                recyclerView.adapter?.notifyItemRemoved(it)
            },
            {
                // Actualizar artículo
                recyclerView.adapter?.notifyItemChanged(it)
            },
            {
                // Crear artículo
                recyclerView.adapter?.notifyItemInserted(articles.size - 1)
            }
        )
    }
}