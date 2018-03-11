package ru.maximov.kotlininaction.ch06.checknull

fun main(args: Array<String>) {
    ignoreNulls("Не NULL")

    ignoreNulls(null)
}

fun ignoreNulls(s: String?) {
    val sNotNull = s!!
    println(sNotNull.length)
}

