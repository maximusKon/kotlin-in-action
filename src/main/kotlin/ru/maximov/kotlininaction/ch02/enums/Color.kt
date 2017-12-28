package ru.maximov.kotlininaction.ch02.enums

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main(args: Array<String>){

    println( mix(Color.RED, Color.YELLOW) )

    println( try { mix(Color.RED, Color.BLUE) }
            catch (e: Exception){ e.message }
    )

    println( mixOptimized(Color.BLUE, Color.YELLOW) )

}

private fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Грязный цвет")
    }


private fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
        (c2 == Color.RED && c1 == Color.YELLOW)
            -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
        (c2 == Color.YELLOW && c1 == Color.BLUE)
            -> Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
        (c2 == Color.BLUE && c1 == Color.VIOLET)
            -> Color.INDIGO
        else -> throw Exception("Грязный цвет")
    }
