package ru.maximov.kotlininaction.ch05.secuences

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    println(
            people.asSequence()
                    .map { it.name }
                    .filter { it.startsWith('A') }
                    .toList()
    )

    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)"); it * it }
            .filter { print("filter($it)"); it % 2 == 0 }

    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)"); it * it }
            .filter { print("filter($it)"); it % 2 == 0 }
            .toList()

    println()

    println(listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)"); it * it }.find { it > 3 }
    )

    println()

    println(
            generateSequence(0) { it + 1 }.takeWhile { print("$it "); it <= 100 }.sum()
    )
}

data class Person(val name: String, val age: Int)
