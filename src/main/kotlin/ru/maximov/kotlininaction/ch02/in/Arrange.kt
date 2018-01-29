package ru.maximov.kotlininaction.ch02.`in`

fun main(args: Array<String>) {
    println(isLetter('x'))
    println(isNotDigit('a'))

    println(recognize('1'))
    println(recognize('b'))
    println(recognize('@'))

    println("Kotlin" in "Java".."Scala")

    println("Kotlin" in setOf("Java", "Scala"))
}

private fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

private fun isNotDigit(c: Char) = c !in '0'..'9'

private fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know.."
}