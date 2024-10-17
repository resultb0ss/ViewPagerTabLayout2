package com.example.viewpagertablayout2

import java.io.Serializable

class Page (val name: String,val url: String, val image: Int): Serializable {

    companion object {
        val pages = mutableListOf(
            Page("Новости","https://dzen.ru/news", R.drawable.ic_news_24),
            Page("Видео","https://yandex.ru/video/", R.drawable.ic_play_black),
            Page("Музыка","https://music.yandex.ru/", R.drawable.baseline_music_video_24),
            Page("Карты","https://yandex.ru/maps/", R.drawable.baseline_gps_fixed_24),
        )
    }
}