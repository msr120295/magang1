package com.example.magangtabeldata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.magangtabeldata.testmvp.MvpActivity

class MainActivity : AppCompatActivity() {

    //deklarasi button untuk pindah ke example mvp
    lateinit var btnMove: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMove = findViewById<Button>(R.id.btnMove)

        btnMove.setOnClickListener {
            val intent = Intent(this, MvpActivity::class.java)
            startActivity(intent)
        }
    }
}