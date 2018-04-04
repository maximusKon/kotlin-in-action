package ru.maximov.kotlininaction.ch06.collections.arrays

fun main(args: Array<String>) {
    val letters = Array(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s%s%s".format(*strings.toTypedArray()))

    val fiveZeros = IntArray(5)
    println(fiveZeros.joinToString())

    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)

    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
}

