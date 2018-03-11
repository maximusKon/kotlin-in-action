package ru.maximov.kotlininaction.ch06.nullables

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)

    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.contryName())
}

fun printAllCaps(s: String?) {
    val allCaps = s?.toUpperCase()
    println(allCaps)
}


class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) = employee.manager?.name


class Address(val streetAddress: String, val zipCode: Int, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.contryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}