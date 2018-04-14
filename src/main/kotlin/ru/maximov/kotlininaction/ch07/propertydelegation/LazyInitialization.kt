package ru.maximov.kotlininaction.ch07.propertydelegation.lazyinitialization

fun main(args: Array<String>) {
    val person = Person("Alice")
    println(person.emails)
    println(person.emails)
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}

data class Email(val address: String)

fun loadEmails(person: Person): List<Email> {
    println("load emails for ${person.name}")
    return listOf(
            Email("someAddress@yandex.ru"),
            Email("someAddress@mail.ru"),
            Email("someAddress@gmail.com")
    )
}

