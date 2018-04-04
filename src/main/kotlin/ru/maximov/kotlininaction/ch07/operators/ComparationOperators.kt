package ru.maximov.kotlininaction.ch07.operators.comparationoperators

fun main(args: Array<String>) {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null != Point(1, 2))
    println(Point(1, 2) == null)

    println(Person("Alice", "Smith") < Person("Bob", "Johnson"))

}

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false

        return other.x == x && other.y == y
    }
}

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person) =
            compareValuesBy(this, other, Person::lastName, Person::firstName)

}