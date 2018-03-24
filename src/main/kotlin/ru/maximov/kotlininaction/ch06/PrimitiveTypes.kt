package ru.maximov.kotlininaction.ch06.primitivetypes

fun main(args: Array<String>) {
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Amy")))

    val i = 1
    //val l: Long = i
    val l: Long = i.toLong()

    println(Long.MAX_VALUE)
    println(Long.MAX_VALUE.toInt())

    val x = 1
//    println(x in listOf(1L, 2L, 3L))
    println(x.toLong() in listOf(1L, 2L, 3L))

    val q: Long = 1
}

data class Person(
        val name: String,
        val age: Int? = null) {

    fun isOlderThan(other: Person): Boolean? =
            if (age == null || other.age == null)
                null
            else
                age > other.age

}