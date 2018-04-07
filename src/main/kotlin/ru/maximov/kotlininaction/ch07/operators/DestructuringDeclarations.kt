package ru.maximov.kotlininaction.ch07.operators

fun main(args: Array<String>) {
    val (name, ext) = splitFilename("example.kt")
    println(name)

    printEntries(mapOf("Oracle" to "Java", "JetBrains" to "Kotlin"))
}

fun splitFilename(fullName: String) =
        fullName.split('.', limit = 2)

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}