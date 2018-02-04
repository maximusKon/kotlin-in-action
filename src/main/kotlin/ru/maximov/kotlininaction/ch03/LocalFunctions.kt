package ru.maximov.kotlininaction.ch03

fun main(args: Array<String>) {
    saveUser(User(1, "", "address"))
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    //сохранение
}

fun User.validateBeforeSave() {

    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

class User(val id: Int, val name: String, val address: String)
