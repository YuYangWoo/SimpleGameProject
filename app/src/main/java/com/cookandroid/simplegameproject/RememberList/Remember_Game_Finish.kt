package com.cookandroid.simplegameproject.RememberList

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.simplegameproject.R
import kotlinx.android.synthetic.main.remember_game_finish.*

class Remember_Game_Finish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.remember_game_finish)
        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

btnMain.setOnClickListener {
    startActivity(Intent(this,Remember_Game_MainActivity::class.java))
}
    }
    override fun onBackPressed() {
        startActivity(Intent(this,Remember_Game_MainActivity::class.java))
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