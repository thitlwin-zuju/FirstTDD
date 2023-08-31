package com.example.firsttdd.unit_test

import com.example.firsttdd.Engine
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import org.junit.Test

class EngineShould {
    private val engine = Engine()
    @Test
    fun turnOn() = runTest {
        // When
        engine.turnOn()
        // Then
        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun increaseTemperature() = runTest {
        // When
        engine.turnOn()
        // Then
        assertTrue(engine.temperature == 95)
    }
}