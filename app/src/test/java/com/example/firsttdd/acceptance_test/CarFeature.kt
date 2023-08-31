package com.example.firsttdd.acceptance_test

import com.example.firsttdd.Car
import com.example.firsttdd.Engine
import com.example.firsttdd.util.MainCoroutineScopeRule
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.advanceUntilIdle
import org.junit.Rule
import org.junit.Test

class CarFeature {
    // Given
    private val engine = Engine()
    private val car = Car(fuel = 6.0, engine = engine)

    @get:Rule
    var coroutineTestRule = MainCoroutineScopeRule()

    @Test
    fun carIsLoosingFuelWhenTurnOn() {
        // When
        car.turnOn()
        // Then
        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreaseTemperature() {
        // When
        car.turnOn()

        coroutineTestRule.advanceUntilIdle()

        // Then
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}