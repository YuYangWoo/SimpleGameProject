package com.cookandroid.simplegameproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class ReactGameAgainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.react_game_again)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("반응속도게임")
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                startActivity(Intent(this,ReactGameMainActivity::class.java))
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onBackPressed() {
        startActivity(Intent(this,ReactGameMainActivity::class.java))
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        startActivity(Intent(this,ReactGameStartActivity::class.java))
        finish()
        return super.onTouchEvent(event)
    }
}