package ru.maximov.kotlininaction.ch04.objects

import java.io.File

fun main(args: Array<String>) {
    Payroll.allemployees.add(Person("Bob"))
    Payroll.calculateSalary()

    println(CaseInsensitiveFileComparator.compare(
            File("/User"),
            File("/user")
    ))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}

object Payroll {

    val allemployees = arrayListOf<Person>()
    fun calculateSalary() {
        for (person in allemployees) {
            //...
        }
    }

}

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
                p1.name.compareTo(p2.name)
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }

}
