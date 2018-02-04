package ru.maximov.kotlininaction.ch03

fun main(args: Array<String>) {

    println("12.345-6.A".split("\\.|-".toRegex()))

    println("12.345-6.A".split(".", "-"))

    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    val kotlinLogo = """| //
                       .|//
                       .|/ \
        """
    println(kotlinLogo.trimMargin("."))
}

private fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}