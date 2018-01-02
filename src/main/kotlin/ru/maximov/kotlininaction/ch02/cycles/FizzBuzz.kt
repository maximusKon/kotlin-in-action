package ru.maximov.kotlininaction.ch02.cycles

fun main(args: Array<String>) {
    for(i in 1..100){
        print(fizzBuzz(i))
    }

    println()

    for(i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
    }
}

private fun fizzBuzz(i: Int) =
        (when {
            (i % 15 == 0) -> "FizzBuzz"
            (i % 5 == 0) -> "Fizz"
            (i % 3 == 0) -> "Buzz"
            else -> "$i"
        }) + " "