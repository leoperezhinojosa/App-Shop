package com.leoperez.app_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.leoperez.app_shop.adapter.ArticleAdapter
import com.leoperez.app_shop.databinding.ActivityMainBinding
import com.leoperez.app_shop.model.Article
import com.leoperez.app_shop.objects_models.ArticleProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var articleList: MutableList<Article> = ArticleProvider.articles
    private lateinit var adapter: ArticleAdapter
    private val manager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAddArticle.setOnClickListener {
            addArticle()
        }
        initRecyclerView()
    }

    private fun addArticle() {
        val article = Article(
            "000F",
            "Nuevo Artículo",
            "Nueva Marca",
            "https://cdn-icons-png.flaticon.com/512/5540/5540433.png",
            0.0,
            0
        )
        articleList.add(index = 0,article)
        adapter.notifyItemInserted(0)
        manager.scrollToPositionWithOffset(0, 10)
        Toast.makeText(this, "Nuevo artículo (predeterminado) creado", Toast.LENGTH_SHORT).show()
    }

    private fun initRecyclerView() {
        adapter = ArticleAdapter(
            articleList,
            onClickListener = { article -> onItemSelected(article) },
            onClickDelete = { position -> onItemDeleted(position) } )
        binding.mainRecyclerView.layoutManager = manager
        binding.mainRecyclerView.adapter = adapter

    }

    private fun onItemDeleted(position: Int) {
        articleList.removeAt(position)
        adapter.notifyItemRemoved(position)
        Toast.makeText(this, "Artículo BORRADO", Toast.LENGTH_SHORT).show()
    }
    private fun onItemSelected(article: Article) {
        Toast.makeText(this, article.name, Toast.LENGTH_SHORT).show()
        // Implementar la navegación a la pantalla de detalle
    }
}