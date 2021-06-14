package com.example.galarry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    lateinit var btnprevious5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        castview()
        castonclick()
    }
        fun castview(){
            btnprevious5=findViewById(R.id.btnpre4)
        }
    fun castonclick(){
        btnprevious5.setOnClickListener {
            intent = Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
}