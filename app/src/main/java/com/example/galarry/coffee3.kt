package com.example.galarry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class coffee3 : AppCompatActivity() {
    lateinit var btn3:Button
    lateinit var btn4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee3)
        castview()
        castonclick()
    }

        fun castview(){
            btn3=findViewById(R.id.btn3)
            btn4=findViewById(R.id.btn4)

        }

      fun castonclick(){
          btn3.setOnClickListener {
              intent = Intent(baseContext, page2::class.java)
              startActivity(intent)
          }
        btn4.setOnClickListener {
            intent = Intent(baseContext, Page4::class.java)
            startActivity(intent)
        }

    }

}