package ru.maximov.kotlininaction.ch05.lambdawithreciever

fun main(args: Array<String>) {
    println(alphabet_with())
    println(alphabet_apply())
    println(alphabet_buildString())
}

fun alphabet_with(): String = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
    toString()
}


fun alphabet_apply(): String = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}.toString()

fun alphabet_buildString(): String = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
}
