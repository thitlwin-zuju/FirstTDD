package com.example.firsttdd

import android.util.Log
import kotlinx.coroutines.delay

class Engine(var isTurnedOn: Boolean = false, var temperature: Int = 0) {

    suspend fun turnOn() {
        delay(6000)
        isTurnedOn = true
        temperature = 95
        Log.d("TDD", "turned on engine")
    }
}