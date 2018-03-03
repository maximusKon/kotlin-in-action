package ru.maximov.kotlininaction.ch04.objects.objectcompanion

fun main(args: Array<String>) {
    A.bar()

    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.Companion.newFacebookUser(4)
    println(subscribingUser)
    println(facebookUser)

    println(facebookUser.copy())
    println(facebookUser === facebookUser.copy())

    loadFromJSON(Person)

    loadFromJSON(object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    })

    val c = Client.fromJSON("JSON_TEXT_STUB")
}

class A {

    companion object {
        fun bar() {
            println("Companion object called")
        }
    }

}

data class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int) = "Facebook Name $accountId"
    }
}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person(val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person = Person("Json Stub")

    }
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T = factory.fromJSON("{}")

class Client(val firstName: String, val lastName: String) {
    companion object
}

fun Client.Companion.fromJSON(jsonText: String) = Client("FN JSON STUB", "LN JSON STUB")