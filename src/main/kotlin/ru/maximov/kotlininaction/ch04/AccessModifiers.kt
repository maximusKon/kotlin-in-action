package ru.maximov.kotlininaction.ch04

open class RichButton : Clickable { // открытый класс, другие могут наследоват его

    fun disable() {} // это закрытая функция, её невозможно переопределить

    open fun animate() {} // это открытая фуекция, её можно переопределить

    override fun click() {} // переопределение открытой функции также является открытым
}

abstract class Animated {

    abstract fun animate() //это абстрактная функция, она не имеет реализации и должна быть переопределена

    open fun stopAnimatig() {} // открытая функция

    fun animateTwice() {} // закрытая функция
}