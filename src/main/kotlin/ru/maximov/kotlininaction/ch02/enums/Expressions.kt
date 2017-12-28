package ru.maximov.kotlininaction.ch02.enums

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main(args: Array<String>){
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

private fun eval(e: Expr): Int{
    if(e is Num){
        val n = e as Num
        return n.value
    }
    if(e is Sum){
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}