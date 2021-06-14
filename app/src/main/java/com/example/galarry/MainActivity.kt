package com.example.galarry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castview()
        castonClick()

//        var content=findViewById<TextView>(R.id.etText1)

    }fun castview(){
        btnNext = findViewById(R.id.btnNext)
    }

    fun castonClick() {
        btnNext.setOnClickListener {
            intent = Intent(baseContext, page2::class.java)
            startActivity(intent)
        }
    }

}
