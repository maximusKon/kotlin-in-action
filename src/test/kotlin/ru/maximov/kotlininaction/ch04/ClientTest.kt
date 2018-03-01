package ru.maximov.kotlininaction.ch04

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import ru.maximov.kotlininaction.ch04.universalobjectmethods.Client
import ru.maximov.kotlininaction.ch04.universalobjectmethods.Order

internal class ClientTest {

    @Test
    @DisplayName("функция copy, генерируемая компилятором при использовании модификатора data производит не глубокое копирование")
    fun copy() {
        val originalClient = Client("Name", 111111, Order(2222))

        val copy = originalClient.copy()

        assertEquals(originalClient, copy)
        assertTrue(originalClient.order === copy.order)
    }
}