package com.example.thedreamteamapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnStudent2).setOnClickListener {
            startActivity(Intent(this, StudentTwoActivity::class.java))
        }

        findViewById<Button>(R.id.btnStudent3).setOnClickListener {
            startActivity(Intent(this, StudentThreeActivity::class.java))
        }

        findViewById<Button>(R.id.btnStudent4).setOnClickListener {
            startActivity(Intent(this, StudentFourActivity::class.java))
        }

        findViewById<Button>(R.id.btnStudent5).setOnClickListener {
            startActivity(Intent(this, StudentFiveActivity::class.java))
        }

        findViewById<Button>(R.id.btnStudent6).setOnClickListener {
            startActivity(Intent(this, StudentSixActivity::class.java))
        }
    }
}
