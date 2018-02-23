package ru.maximov.kotlininaction.ch04.primaryconstructors

class User(
        val nickname: String,
        val isSubscribed: Boolean = true
)

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)

    val bob = User("Bob", false)
    println(bob.isSubscribed)

    val carol = User("Carol", isSubscribed = false)
    println(bob.isSubscribed)
}


open class User1(val nickname: String)

class TwitterUser(nickname: String) : User1(nickname)


open class Button

class RadioButton : Button()


class Secretive private constructor()