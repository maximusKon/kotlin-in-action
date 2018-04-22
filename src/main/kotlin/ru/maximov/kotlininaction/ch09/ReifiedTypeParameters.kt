package ru.maximov.kotlininaction.ch09

import java.util.*
import javax.xml.ws.Service

fun main(args: Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(123))

    println(listOf("one", 2, "three").filterIsInstance<String>())

    loadService<Service>()
}

inline fun <reified T> isA(value: Any) = value is T

inline fun <reified T> Iterable<*>.filterIsInstance() = this.filter { it is T }

inline fun <reified T> loadService() = ServiceLoader.load(T::class.java)
