package io.deep27soft.udemy.kotlin.challenges.challenge_01

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Referetial equality of hello1 and hello2: ${hello1 === hello2}")
    println("Structural equality of hello1 and hello2: ${hello1 == hello2}")

    var number = 2998

    val anyQuote: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (anyQuote is String) {
        println(anyQuote.toUpperCase())
    }

    val indentedText = """
        1
       11
      111
     1111
    """.trimIndent()
    println(indentedText)
}