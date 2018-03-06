package ru.maximov.kotlininaction.ch05.lambdas

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum(1, 2));

    { println(42) }()

    run { println(42) }


    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy({ p: Person -> p.age }))
    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy { p -> p.age })
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    val getAge = { p: Person -> p.age }
    println(people.maxBy(getAge))

    println(people.joinToString(separator = " ",
            transform = { p: Person -> p.name })
    )

    val namesString = people.joinToString(" ") { p: Person -> p.name }
    println(namesString)
}

data class Person(val name: String, val age: Int)
