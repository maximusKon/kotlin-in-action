package ru.maximov.kotlininaction.ch06.letfunction

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }
}

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

