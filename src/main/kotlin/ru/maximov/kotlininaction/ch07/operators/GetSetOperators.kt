package ru.maximov.kotlininaction.ch07.operators.getsetoperators

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p[1])

    val p1 = MutablePoint(10, 20)
    p1[1] = 42
    println(p1)
}

data class Point(val x: Int, val y: Int)

operator fun Point.get(index: Int) =
        when (index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid cooredinate $index")
        }

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) =
        when (index) {
            0 -> x = value
            1 -> y = value
            else -> throw IndexOutOfBoundsException("Invalid cooredinate $index")
        }