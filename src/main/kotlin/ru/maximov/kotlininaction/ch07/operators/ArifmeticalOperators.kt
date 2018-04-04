package ru.maximov.kotlininaction.ch07.operators.arifmeticaloperators

fun main(args: Array<String>) {
    var p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 - p2)
    println(p1 * 1.5)
    println(1.5 * p1)

    println('a' * 3)

    p1 += Point(3, 4)
    println(p1)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)

    println(-p1)

}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

operator fun Point.minus(other: Point) = Point(x - other.x, y - other.y)
operator fun Point.times(scale: Double) = Point((x * scale).toInt(), (y * scale).toInt())
operator fun Double.times(p: Point) = p * this
operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Char.times(count: Int) = this.toString().repeat(count)