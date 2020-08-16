package com.cookandroid.simplegameproject.RememberList

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import com.cookandroid.simplegameproject.GameListActivity
import com.cookandroid.simplegameproject.R
import com.cookandroid.simplegameproject.RankingActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.remember_game_level1.*
import kotlinx.android.synthetic.main.remember_game_level1.view.*
import java.lang.Math.random
import java.util.*
import java.util.logging.Handler
import kotlin.concurrent.schedule
import kotlin.concurrent.timer
import kotlin.random.Random
import kotlin.random.nextInt

class Remember_Game_Level1 : AppCompatActivity() {
    private fun appear():Int = ((1..9).random())

    var lives=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.remember_game_level1)
        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("LV 1")
       // var gl = GameItem()

        var a = arrayOf(appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear())
        var b = a.distinct()
Log.d("bb","onCreate")
   // var lives = intent.getIntExtra("lives", 0)
        //txtLives.text = "Lives : " +(lives).toString()
      //  Log.i("bb", lives.toString())
     Timer().schedule(1000){
          // arr[appear()].setBackgroundColor(Color.WHITE)
         for(i in 0..2) {
             when (b[i]) {
                 1 -> btn1.setBackgroundColor(Color.WHITE)
                 2 -> btn2.setBackgroundColor(Color.WHITE)
                 3 -> btn3.setBackgroundColor(Color.WHITE)
                 4 -> btn4.setBackgroundColor(Color.WHITE)
                 5 -> btn5.setBackgroundColor(Color.WHITE)
                 6 -> btn6.setBackgroundColor(Color.WHITE)
                 7 -> btn7.setBackgroundColor(Color.WHITE)
                 8 -> btn8.setBackgroundColor(Color.WHITE)
                 9 -> btn9.setBackgroundColor(Color.WHITE)
             }
         }
       }
        var backColor = resources.getColor(R.color.blodBlue)
        Timer().schedule(2000){
            // arr[appear()].setBackgroundColor(Color.WHITE)
            for(i in 0..2) {
                when (b[i]) {
                    1 -> btn1.setBackgroundColor(backColor)
                    2 -> btn2.setBackgroundColor(backColor)
                    3 -> btn3.setBackgroundColor(backColor)
                    4 -> btn4.setBackgroundColor(backColor)
                    5 -> btn5.setBackgroundColor(backColor)
                    6 -> btn6.setBackgroundColor(backColor)
                    7 -> btn7.setBackgroundColor(backColor)
                    8 -> btn8.setBackgroundColor(backColor)
                    9 -> btn9.setBackgroundColor(backColor)
                }
            }
        }

        var correctClick=3
        var unCorrectClick=3

        btn1.setOnClickListener{
            if(b[0] == 1 || b[1] == 1 || b[2] == 1){
                btn1.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    lives--
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
            else {
                btn1.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn2.setOnClickListener{
            if(b[0] == 2 || b[1] == 2 || b[2] == 2){
                btn2.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn2.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3.setOnClickListener{
            if(b[0] == 3 || b[1] == 3 || b[2] == 3){
                btn3.setBackgroundColor(Color.WHITE)
               correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn3.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                 lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn4.setOnClickListener{
            if(b[0] == 4 || b[1] == 4 || b[2] == 4){
                btn4.setBackgroundColor(Color.WHITE)
           correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn4.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn5.setOnClickListener{
            if(b[0] == 5 || b[1] == 5 || b[2] == 5){
                btn5.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn5.setBackgroundColor(Color.DKGRAY)
               unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn6.setOnClickListener{
            if(b[0] == 6 || b[1] == 6 || b[2] == 6){
                btn6.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn6.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn7.setOnClickListener{
            if(b[0] == 7 || b[1] == 7 || b[2] == 7){
                btn7.setBackgroundColor(Color.WHITE)
              correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn7.setBackgroundColor(Color.DKGRAY)
               unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn8.setOnClickListener{
            if(b[0] == 8 || b[1] == 8 || b[2] == 8){
                btn8.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn8.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn9.setOnClickListener{
            if(b[0] == 9 || b[1] == 9 || b[2] == 9){
                btn9.setBackgroundColor(Color.WHITE)
               correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_Level2::class.java))
                }
            }
            else {
                btn9.setBackgroundColor(Color.DKGRAY)
              unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level1::class.java)
                    startActivity(Intent)
                     if(lives==0)
                     {
                         startActivity(Intent(this,Remember_Game_Finish::class.java))
                     }
                }
            }
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