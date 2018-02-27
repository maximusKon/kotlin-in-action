package ru.maximov.kotlininaction.ch04.workwithfieldsfromaccessmethods

class User(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val bob = User("Bob")
    bob.address = "Fleet St."
}
