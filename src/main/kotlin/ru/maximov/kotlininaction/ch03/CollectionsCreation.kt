package ru.maximov.kotlininaction.ch03

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53)
    println(set.javaClass)

    val list = arrayListOf(1, 7, 53)
    println(list.javaClass)

    val map = hashMapOf(1 to "One", 7 to "seven", 53 to "fifty-three")
    println(map.javaClass)


    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}