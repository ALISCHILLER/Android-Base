package com.msa.services_section1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myService=Intent(this,Foregroundservices::class.java)
        myService.putExtra(Constants.inputExtra,"service")
        ContextCompat.startForegroundService(this,myService)

    }
}