package ru.maximov.kotlininaction.ch08.functypeemptyvalues

fun main(args: Array<String>) {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
}

fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }

    result.append(postfix)

    return result.toString()
}