package com.cookandroid.simplegameproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ActionBar Title 변경
        supportActionBar?.setTitle("윤상건호양우")
        btnMeasure.setOnClickListener{
            startActivity(Intent(this, GameListActivity::class.java))
        }
        btnRanking.setOnClickListener{
            startActivity(Intent(this, RankingActivity::class.java))
        }
        btnInformation.setOnClickListener{
            startActivity(Intent(this, MyInformationActivity::class.java))
        }
        btnShare.setOnClickListener{
            startActivity(Intent(this, ShareScoreActivity::class.java))
        }
    }
}