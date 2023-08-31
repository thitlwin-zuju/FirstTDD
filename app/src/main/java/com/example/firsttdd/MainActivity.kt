package com.example.firsttdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val car = Car(20.0, Engine())
        car.turnOn()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}