package ru.maximov.kotlininaction.ch03

var opCount = 0

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

fun main(args: Array<String>) {
    reportOperationCount()

    performOperation()
    performOperation()
    performOperation()

    reportOperationCount()
}