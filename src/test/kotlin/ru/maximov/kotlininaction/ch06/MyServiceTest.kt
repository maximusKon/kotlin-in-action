package ru.maximov.kotlininaction.ch06

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.maximov.kotlininaction.ch06.lateinitialization.MyService

internal class MyServiceTest {

    private lateinit var myService: MyService

    @BeforeEach
    fun before() {
        myService = MyService()
    }

    @Test
    fun testAction() {
        assertEquals("foo", myService.performAction())
    }
}