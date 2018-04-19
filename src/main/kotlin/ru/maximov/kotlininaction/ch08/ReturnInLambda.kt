package ru.maximov.kotlininaction.ch08.returninlambda

fun main(args: Array<String>) {
    val people = listOf(Person("Alice"), Person("Bob"))

    people.lookForAlice()
}

class Person(val name: String)

fun List<Person>.lookForAlice() {
    this.forEach {
        println(it.name)
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
}