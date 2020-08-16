package com.cookandroid.simplegameproject.RememberList

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.cookandroid.simplegameproject.R
import kotlinx.android.synthetic.main.remember_game_level2.*
import kotlinx.android.synthetic.main.remember_game_level3.*
import java.util.*
import kotlin.concurrent.schedule

class Remember_Game_Level3 : AppCompatActivity() {
    private fun appear():Int = ((1..16).random())

    var lives=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.remember_game_level3)
        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // ActionBar Title 변경
        supportActionBar?.setTitle("LV 1")
        // var gl = GameItem()

        var a = arrayOf(appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear(),appear())
        var b = a.distinct()
        Log.d("bb","onCreate")
        // var lives = intent.getIntExtra("lives", 0)
        //txtLives.text = "Lives : " +(lives).toString()
        //  Log.i("bb", lives.toString())
        Timer().schedule(1000){
            // arr[appear()].setBackgroundColor(Color.WHITE)
            for(i in 0..5) {
                when (b[i]) {
                    1 -> btn3_1.setBackgroundColor(Color.WHITE)
                    2 -> btn3_2.setBackgroundColor(Color.WHITE)
                    3 -> btn3_3.setBackgroundColor(Color.WHITE)
                    4 -> btn3_4.setBackgroundColor(Color.WHITE)
                    5 -> btn3_5.setBackgroundColor(Color.WHITE)
                    6 -> btn3_6.setBackgroundColor(Color.WHITE)
                    7 -> btn3_7.setBackgroundColor(Color.WHITE)
                    8 -> btn3_8.setBackgroundColor(Color.WHITE)
                    9 -> btn3_9.setBackgroundColor(Color.WHITE)
                    10 -> btn3_10.setBackgroundColor(Color.WHITE)
                    11-> btn3_11.setBackgroundColor(Color.WHITE)
                    12-> btn3_12.setBackgroundColor(Color.WHITE)
                    13-> btn3_13.setBackgroundColor(Color.WHITE)
                    14-> btn3_14.setBackgroundColor(Color.WHITE)
                    15-> btn3_15.setBackgroundColor(Color.WHITE)
                    16-> btn3_16.setBackgroundColor(Color.WHITE)
                }
            }
        }
        var backColor = resources.getColor(R.color.blodBlue)
        Timer().schedule(2000){
            // arr[appear()].setBackgroundColor(Color.WHITE)
            for(i in 0..5) {
                when (b[i]) {
                    1 -> btn3_1.setBackgroundColor(backColor)
                    2 -> btn3_2.setBackgroundColor(backColor)
                    3 -> btn3_3.setBackgroundColor(backColor)
                    4 -> btn3_4.setBackgroundColor(backColor)
                    5 -> btn3_5.setBackgroundColor(backColor)
                    6 -> btn3_6.setBackgroundColor(backColor)
                    7 -> btn3_7.setBackgroundColor(backColor)
                    8 -> btn3_8.setBackgroundColor(backColor)
                    9 -> btn3_9.setBackgroundColor(backColor)
                    10 -> btn3_10.setBackgroundColor(backColor)
                    11-> btn3_11.setBackgroundColor(backColor)
                    12-> btn3_12.setBackgroundColor(backColor)
                    13-> btn3_13.setBackgroundColor(backColor)
                    14-> btn3_14.setBackgroundColor(backColor)
                    15-> btn3_15.setBackgroundColor(backColor)
                    16-> btn3_16.setBackgroundColor(backColor)
                }
            }
        }

        var correctClick=6
        var unCorrectClick=6

        btn3_1.setOnClickListener{
            if(b[0] == 1 || b[1] == 1 || b[2] == 1||b[3]==1||b[4]==1||b[5]==1){
                btn3_1.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    lives--
                    startActivity(Intent(this, Remember_Game_End::class.java))
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
            else {
                btn3_1.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_2.setOnClickListener{
            if(b[0] == 2 || b[1] == 2 || b[2] == 2||b[3]==2||b[4]==2||b[5]==2){
                btn3_2.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_2.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_3.setOnClickListener{
            if(b[0] == 3 || b[1] == 3 || b[2] == 3||b[3]==3||b[4]==3||b[5]==3){
                btn3_3.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_3.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_4.setOnClickListener{
            if(b[0] == 4 || b[1] == 4 || b[2] == 4||b[3]==4||b[4]==4||b[5]==4){
                btn3_4.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_4.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_5.setOnClickListener{
            if(b[0] == 5 || b[1] == 5 || b[2] == 5||b[3]==5||b[4]==5||b[5]==5){
                btn3_5.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_5.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_6.setOnClickListener{
            if(b[0] == 6 || b[1] == 6 || b[2] == 6||b[3]==6||b[4]==6||b[5]==6){
                btn3_6.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_6.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_7.setOnClickListener{
            if(b[0] == 7 || b[1] == 7 || b[2] == 7||b[3]==1||b[4]==7||b[5]==7){
                btn3_7.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_7.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_8.setOnClickListener{
            if(b[0] == 8 || b[1] == 8 || b[2] == 8||b[3]==8||b[4]==8||b[5]==8){
                btn3_8.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_8.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_9.setOnClickListener{
            if(b[0] == 10 || b[1] == 10 || b[2] == 10||b[3]==10||b[4]==10||b[5]==10){
                btn3_9.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_9.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_10.setOnClickListener{
            if(b[0] == 10 || b[1] == 10 || b[2] == 10||b[3]==10||b[4]==10||b[5]==10){
                btn3_10.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_10.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_11.setOnClickListener{
            if(b[0] == 11 || b[1] == 11 || b[2] == 11||b[3]==11||b[4]==11||b[5]==11){
                btn3_11.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_11.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_12.setOnClickListener{
            if(b[0] == 12 || b[1] == 12 || b[2] == 12||b[3]==12||b[4]==12||b[5]==12){
                btn3_12.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_12.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_13.setOnClickListener{
            if(b[0] == 13 || b[1] == 13 || b[2] == 13||b[3]==13||b[4]==13||b[5]==13){
                btn3_13.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_13.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_14.setOnClickListener{
            if(b[0] == 14 || b[1] == 14 || b[2] == 14||b[3]==14||b[4]==14||b[5]==14){
                btn3_14.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_14.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_16.setOnClickListener{
            if(b[0] == 16 || b[1] == 16 || b[2] == 16||b[3]==16||b[4]==16||b[5]==16){
                btn3_16.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_16.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
                    startActivity(Intent)
                    if(lives==0)
                    {
                        startActivity(Intent(this,Remember_Game_Finish::class.java))
                    }
                }
            }
        }
        btn3_15.setOnClickListener{
            if(b[0] == 15 || b[1] == 15 || b[2] == 15||b[3]==15||b[4]==15||b[5]==15){
                btn3_15.setBackgroundColor(Color.WHITE)
                correctClick--
                if(correctClick==0)
                {
                    startActivity(Intent(this, Remember_Game_End::class.java))
                }
            }
            else {
                btn3_15.setBackgroundColor(Color.DKGRAY)
                unCorrectClick--
                if(unCorrectClick==0)
                {
                    lives--
                    val Intent = Intent(this, Remember_Game_Level2::class.java)
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


