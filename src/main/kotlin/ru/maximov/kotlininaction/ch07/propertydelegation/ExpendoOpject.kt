package ru.maximov.kotlininaction.ch07.propertydelegation.exoandoobject

fun main(args: Array<String>) {
    val person = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")

    for ((attrName, value) in data) {
        person.setAttribute(attrName, value)
    }

    println(person.name)

    person.name = "Renamed"

    println(person.name)


}

class Person {

    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(atrName: String, value: String) {
        _attributes[atrName] = value
    }

    var name: String by _attributes
}