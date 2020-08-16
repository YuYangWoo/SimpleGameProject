package com.cookandroid.simplegameproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.react_game_result.*
import java.util.*
import kotlin.concurrent.timer

class ReactGameClickActivity : AppCompatActivity() {
    private var time = 0
    private var timerTask: Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.react_game_click)
        timerTask = kotlin.concurrent.timer(period = 1) {
            time++
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("반응속도게임")

    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val lapTime = time
        val intent = Intent(this, ReactGameResultActivity::class.java)
        intent.putExtra("record",lapTime.toString())
        startActivity(intent)
        finish()
        return super.onTouchEvent(event)
    }
    override fun onBackPressed() {
        startActivity(Intent(this,ReactGameMainActivity::class.java))
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
}