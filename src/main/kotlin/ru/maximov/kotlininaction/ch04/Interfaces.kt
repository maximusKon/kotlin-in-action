package ru.maximov.kotlininaction.ch04

fun main(args: Array<String>) {
    Button().apply {
        showOff()
        setFocus(true)
        click()
    }


}

class Button : Clickable, Focusable {

    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

interface Clickable {
    fun click()

    fun showOff() = println("I'm clickable")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable")
}