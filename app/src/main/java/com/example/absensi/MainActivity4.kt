package com.example.absensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    fun sis(view: View){
        val efita = Intent(this, MainActivity3::class.java)
        startActivity(efita)
    }

}