package com.example.viewpagertablayout2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagertablayout2.databinding.FragmentViewPagerBinding

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentViewPagerBinding.inflate(inflater,container,false)

        val viewPagerItem = arguments?.getSerializable("page" ) as Page
        binding.webView.loadUrl(viewPagerItem.url)

        return binding.root
    }


}