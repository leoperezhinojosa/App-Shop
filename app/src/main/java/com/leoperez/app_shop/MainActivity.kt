package com.leoperez.app_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.leoperez.app_shop.adapter.ArticleAdapter
import com.leoperez.app_shop.databinding.ActivityMainBinding
import com.leoperez.app_shop.models.Article
import com.leoperez.app_shop.objects_models.ArticleProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var articleList: MutableList<Article> = ArticleProvider.articles
    private lateinit var adapter: ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter = ArticleAdapter(
            articleList,
            onClickListener = { article -> onItemSelected(article) },
            onClickDelete = { position -> onItemDeleted(position) } )
        val manager = LinearLayoutManager(this)
        binding.mainRecyclerView.layoutManager = manager
        binding.mainRecyclerView.adapter = adapter

    }

    private fun onItemDeleted(position: Int) {
        articleList.removeAt(position)
        adapter.notifyItemRemoved(position)
    }
    private fun onItemSelected(article: Article) {
        Toast.makeText(this, article.name, Toast.LENGTH_SHORT).show()

    }
}