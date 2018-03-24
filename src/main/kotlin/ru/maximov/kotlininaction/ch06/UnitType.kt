package ru.maximov.kotlininaction.ch06.unittype

interface Processor<T> {
    fun processor(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun processor() {

    }
}

