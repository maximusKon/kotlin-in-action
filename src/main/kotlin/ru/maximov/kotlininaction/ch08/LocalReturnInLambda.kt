package ru.maximov.kotlininaction.ch08.localreturninlambda

fun main(args: Array<String>) {
    val people = listOf(Person("Alice"), Person("Bob"), Person("Steve"))

    people.lookForAlice()
    println("--------")
    people.lookForBob()

    println()

    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}

class Person(val name: String)

fun List<Person>.lookForAlice() {
    this.forEach label@{
        println(it.name)
        if (it.name == "Alice") {
            println("Found!")
            return@label
        }
    }
}

fun List<Person>.lookForBob() {
    this.forEach {
        println(it.name)
        if (it.name == "Bob") {
            println("Found!")
            return@forEach
        }
    }
}