package ru.maximov.kotlininaction.ch09

fun main(args: Array<String>) {
//    printSum(setOf(1, 2, 3))
//    printSum(listOf("1", "2", "3"))
    printSum1(listOf(1, 2, 3))

}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun printSum1(c: Collection<Int>) {
    if (c is List<Int>)
        println(c.sum())
    else
        throw IllegalArgumentException("List is expected")
}

fun List<Int>.sum() =
        this.sumBy { it }