package ru.maximov.kotlininaction.ch08.functypevariabledeclaration

fun main(args: Array<String>) {
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    val action: () -> Unit = { println(42) }

    val canReturnNull: (Int, Int) -> Int? = { i: Int, i1: Int -> null }

    val funOrNull: ((Int, Int) -> Int)? = null
}

