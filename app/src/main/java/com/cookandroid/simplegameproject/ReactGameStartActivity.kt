package com.cookandroid.simplegameproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class ReactGameStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.react_game_start)
        restart()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("반응속도게임")
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        stop()
        startActivity(Intent(this,ReactGameAgainActivity::class.java))
        finish()
        return super.onTouchEvent(event)
    }
    override fun onBackPressed() {
        startActivity(Intent(this,ReactGameMainActivity::class.java))
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                stop()
                startActivity(Intent(this,ReactGameMainActivity::class.java))
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    var my_runnable = Runnable {
        stop()
        startActivity(Intent(this, ReactGameClickActivity::class.java))
    }

    var handler =
        Handler() // use 'new Handler(Looper.getMainLooper());' if you want this handler to control something in the UI
    val random = Random()
    fun rand() : Long {
        return random.nextLong()
    }

    // to stop the handler
    fun stop() {
        handler.removeCallbacks(my_runnable)
    }

    // to reset the handler
    fun restart() {
        handler.removeCallbacks(my_runnable)
        handler.postDelayed(my_runnable, rand()%2000+3000L)
    }
}