package com.cookandroid.simplegameproject.RememberList

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.simplegameproject.MainActivity
import com.cookandroid.simplegameproject.R
import com.cookandroid.simplegameproject.RankingActivity
import kotlinx.android.synthetic.main.remember_game_end.*

class Remember_Game_End : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.remember_game_end)

        btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}