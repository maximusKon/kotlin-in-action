package ru.maximov.kotlininaction.ch05

fun main(args: Array<String>) {
    run(::salute)

    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person::isAdult
    println(predicate(p))

    val dmitry = createPerson("Dmitry", 31)
    val dmitryAgeFunc = dmitry::age
    println(dmitryAgeFunc())
}

fun salute() = println("Salute!")

data class Person(val name: String, val age: Int)

fun Person.isAdult() = this.age >= 21