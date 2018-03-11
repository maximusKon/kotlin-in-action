package ru.maximov.kotlininaction.ch06

fun main(args: Array<String>) {
    printHashCode(null)

    //printHashCodeForNonNull(null)
    printHashCodeForNonNull(42)
}

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun <T : Any> printHashCodeForNonNull(t: T) {
    println(t.hashCode())
}