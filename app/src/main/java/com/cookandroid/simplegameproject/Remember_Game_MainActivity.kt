package com.cookandroid.simplegameproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Remember_Game_MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.remember_game_main)

        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("기억하기게임")

    }
}