package ru.maximov.kotlininaction.ch06.nothingtype

fun main(args: Array<String>) {
    val someNullableString: String? = null

    val address = someNullableString ?: fail("No address")
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}