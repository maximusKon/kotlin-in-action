package ru.maximov.kotlininaction.ch05.collectionsapi

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age >= 31 })

    val list = listOf(1, 2, 3, 4)
    println(list.map { it * it })

    println(people.map { it.age })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })


    val canBeInClub29 = { p: Person -> p.age <= 29 }

    println(people.all(canBeInClub29))

    println(people.any(canBeInClub29))

    println(people.count(canBeInClub29))

    println(people.find(canBeInClub29))


    val people1 = listOf(
            Person("Alice", 29),
            Person("Bob", 31),
            Person("Carol", 31)
    )

    println(people1.groupBy { it.age })

    val strings = listOf("a", "b", "ab")
    println(strings.groupBy(String::first))


    val books = listOf(
            Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Oment", listOf("Terry Pratchett", "Neil Gaiman"))
    )
    println(books.flatMap { it.authors }.toSet())

    val listOfLists = listOf(
            listOf("Jasper Fforde"),
            listOf("Terry Pratchett"),
            listOf("Terry Pratchett", "Neil Gaiman")
    )
    println(listOfLists.flatten())
}

data class Person(val name: String, val age: Int)

class Book(val title: String, val authors: List<String>)