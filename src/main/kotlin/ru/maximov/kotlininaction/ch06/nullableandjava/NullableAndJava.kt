package ru.maximov.kotlininaction.ch06.nullableandjava

fun main(args: Array<String>) {
    yellAtSafe(Person(null))

    yellAt(Person(null))
}

fun yellAt(person: Person) {
    println(person.name.toUpperCase() + "!!!")
}

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}


class StringPrinter : StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
        value?.let {
            println(value)
        }
    }
}