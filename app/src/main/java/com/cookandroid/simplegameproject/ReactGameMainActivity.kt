package com.cookandroid.simplegameproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ReactGameMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.react_game_main)

        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("반응속도게임")
    }
}