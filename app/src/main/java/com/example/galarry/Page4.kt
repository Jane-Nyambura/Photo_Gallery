package com.example.galarry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4 : AppCompatActivity() {
    lateinit var btnpre4:Button
    lateinit var btn4p:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        castview()
        cstonclick()
    }
    fun castview(){
        btnpre4= findViewById<Button>(R.id.btnpre4)
        btn4p= findViewById<Button>(R.id.btn4p)

        }
    fun cstonclick() {
        btnpre4.setOnClickListener {
            intent = Intent(baseContext, coffee3::class.java)
            startActivity(intent)

        }
        btn4p.setOnClickListener {
            intent = Intent(baseContext, page5::class.java)
            startActivity(intent)
        }
    }
}
