package ru.maximov.kotlininaction.ch03

fun main(args: Array<String>) {
    println(listOf(1, 2, 3).joinToString(";", "(", ")"))
    println(listOf(1, 2, 3).joinToString(separator = " ", prefix = "[", postfix = "]"))
    println(listOf(1, 2, 3).joinToString(separator = " ", postfix = "]"))
}

fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}