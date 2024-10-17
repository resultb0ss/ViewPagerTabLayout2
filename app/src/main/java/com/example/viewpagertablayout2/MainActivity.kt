package com.example.viewpagertablayout2

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.viewpagertablayout2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    val pages = Page.pages
    private lateinit var adapter: PageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = PageAdapter(this, pages)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) {tab, position ->
            val name = pages[position].name
            tab.text = name
            tab.setIcon(pages[position].image)
        }.attach()

    }
}