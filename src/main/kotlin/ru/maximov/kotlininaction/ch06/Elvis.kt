package ru.maximov.kotlininaction.ch06.elvis

fun main(args: Array<String>) {
    val person = Person("Dmitry", null)
    println(person.contryName())

    val address = Address("Elestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person1 = Person("Dmitry", jetbrains)

    printShippingLabel(person1)

    Thread.sleep(500)

    printShippingLabel(Person("Alexey", null))
}

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.contryName() = this.company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")

    with(address) {
        println(address.streetAddress)
        println("$zipCode $city, $country")
    }
}