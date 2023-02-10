package com.example.absensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun ini(view: View) {
        val efita = Intent(this,MainActivity4::class.java)
        startActivity(efita)
    }
    fun  iti(view: View){
        val efita = Intent(this,MainActivity2::class.java)
        startActivity(efita)
    }
}
