package ru.maximov.kotlininaction.ch08

import java.lang.StringBuilder

fun main(args: Array<String>) {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }

    println("ab1c".filter { it in 'a'..'z' })
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    this.forEach { if (predicate(it)) sb.append(it) }
    return sb.toString()
}