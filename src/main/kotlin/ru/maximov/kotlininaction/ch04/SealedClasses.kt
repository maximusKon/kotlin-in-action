package ru.maximov.kotlininaction.ch04

sealed class Expr {

    class Num(val value: Int) : Expr()

}

class Sum(val left: Int, val right: Int) : Expr()

fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Sum -> e.left + e.right
        }