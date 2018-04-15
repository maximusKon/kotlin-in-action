package ru.maximov.kotlininaction.ch08.returningfuncfromfunc

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")
}

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double =
        if (delivery == Delivery.EXPEDITED)
            { order -> 6 + 2.1 * order.itemCount }
        else
            { order -> 1.2 * order.itemCount }


class Order(val itemCount: Int)

enum class Delivery { STANDARD, EXPEDITED }