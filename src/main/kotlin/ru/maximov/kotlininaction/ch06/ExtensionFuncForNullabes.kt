package ru.maximov.kotlininaction.ch06

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
    verifyUserInput("")
}

fun verifyUserInput(s: String?) {
    if (s.isNullOrBlank()) {
        println("Pleace fill in required fields")
    }
}