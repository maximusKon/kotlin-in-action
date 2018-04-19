package ru.maximov.kotlininaction.ch08.anonimusfunctions

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 30))

    people.lookForAlice()

    println(people.filter(fun(person) = person.age < 30))

    //println(people.filter{ return it.age < 30})
    //println(people.notInlinedFiler { return it.age < 30})
}

data class Person(val name: String, val age: Int)

fun List<Person>.notInlinedFiler(predicate: (Person) -> Boolean) {
    this.filter(predicate)
}

fun List<Person>.lookForAlice() {
    this.forEach(fun(person) {
        println(person.name)
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    )
}