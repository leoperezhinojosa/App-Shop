package com.leoperez.app_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.leoperez.app_shop.adapter.ArticleAdapter
import com.leoperez.app_shop.databinding.ActivityMainBinding
import com.leoperez.app_shop.objects_models.Articles.articles

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}