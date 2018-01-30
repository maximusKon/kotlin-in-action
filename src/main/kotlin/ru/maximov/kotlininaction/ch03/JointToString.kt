package ru.maximov.kotlininaction.ch03

fun main(args: Array<String>) {
    println(joinToString(listOf(1, 2, 3), ";", "(", ")"))
    println(joinToString(listOf(1, 2, 3), sepearator = " ", prefix = "[", postfix = "]"))
    println(joinToString(listOf(1, 2, 3), sepearator = " ", postfix = "]"))
}

fun <T> joinToString(
        collection: Collection<T>,
        sepearator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(sepearator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}