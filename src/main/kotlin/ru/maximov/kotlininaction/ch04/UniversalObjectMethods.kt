package ru.maximov.kotlininaction.ch04.universalobjectmethods

//class Client(val name: String, val postalCode: Int) {
//
//    override fun equals(other: Any?) =
//            other is Client &&
//                    name == other.name && postalCode == other.postalCode
//
//    override fun hashCode() = name.hashCode() * 31 + postalCode
//
//    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
//
//}

data class Client(val name: String, val postalCode: Int)