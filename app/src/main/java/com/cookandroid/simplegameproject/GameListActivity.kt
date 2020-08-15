package com.cookandroid.simplegameproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.game_list.*

class GameListActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_list)

        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // ActionBar Title 변경
        supportActionBar?.setTitle("게임리스트")
         // 측정하기 들어가기
        btnReact.setOnClickListener {
          startActivity(Intent(this,ReactGameMainActivity::class.java))
        }
            // 기억하기 들어가기
            btnRemember.setOnClickListener {
                startActivity(Intent(this,Remember_Game_MainActivity::class.java))
        }
    }
    // ActionBar ItemSelected 이벤트
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}