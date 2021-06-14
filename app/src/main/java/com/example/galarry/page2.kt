package com.example.galarry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page2 : AppCompatActivity() {
    lateinit var btnNext1: Button
    lateinit var btnprevious1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castView()
        onClick2()


    }

    fun castView() {
        btnprevious1= findViewById(R.id.btnprevious1)
        btnNext1= findViewById(R.id.btnNext1)

    }

    fun onClick2() {
        btnNext1.setOnClickListener {
            var intent=Intent(baseContext, coffee3::class.java)
            startActivity(intent)
        }
        btnprevious1.setOnClickListener {
            var intent=Intent(baseContext,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}