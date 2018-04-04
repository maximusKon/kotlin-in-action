package ru.maximov.kotlininaction.ch07.operators.inoperator

fun main(args: Array<String>) {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

data class Point(val x: Int, val y: Int)

operator fun Rectangle.contains(point: Point) =
        point.x in upperLeft.x until lowerRight.x &&
                point.y in upperLeft.y until lowerRight.y