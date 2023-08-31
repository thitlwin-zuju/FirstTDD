package com.example.firsttdd.unit_test

import com.example.firsttdd.Car
import com.example.firsttdd.Engine
import com.example.firsttdd.util.MainCoroutineScopeRule
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock

class CarShould {
    // Given
    private val engine: Engine = mock()
    private val car = Car(5.0, engine)

    @get:Rule
    var coroutineTestRule = MainCoroutineScopeRule()

    @Test
    fun looseFuelWhenTurnOn() {
        // When
        car.turnOn()
        // Then
        assertEquals(4.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine() = runTest {
        // When
        car.turnOn()
        // Then
        verify(engine, times(1)).turnOn()
    }
}