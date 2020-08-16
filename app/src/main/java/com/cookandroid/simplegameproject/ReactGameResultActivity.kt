package com.cookandroid.simplegameproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.react_game_result.*

class ReactGameResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.react_game_result)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        timelab.text = intent.getStringExtra("record") + timelab.text
        // ActionBar Title 변경
        supportActionBar?.setTitle("반응속도게임")
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        startActivity(Intent(this,ReactGameStartActivity::class.java))
        return super.onTouchEvent(event)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                startActivity(Intent(this,ReactGameMainActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onBackPressed() {
        startActivity(Intent(this,ReactGameMainActivity::class.java))
    }
}