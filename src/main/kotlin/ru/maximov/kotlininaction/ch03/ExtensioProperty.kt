package ru.maximov.kotlininaction.ch03

var StringBuilder.lastChar: Char
    get() = this[length - 1]
    set(value) {
        setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}