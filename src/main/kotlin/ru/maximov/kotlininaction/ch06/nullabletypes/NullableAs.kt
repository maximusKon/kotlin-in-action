package ru.maximov.kotlininaction.ch06.nullabletypes.nullableas

fun main(args: Array<String>) {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")

    println(p1 == p2)

    println(p1.equals(42))
}

class Person(val firstName: String, val lastName: String) {

    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false

        return otherPerson.firstName == this.firstName &&
                otherPerson.lastName == this.lastName
    }

    override fun hashCode(): Int =
            firstName.hashCode() * 37 + lastName.hashCode()
}

