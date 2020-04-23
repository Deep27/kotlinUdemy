package io.deep27soft.udemy.kotlin.basic.strings

fun main(args: Array<String>) {

    val filePath = "c:\\somedir\\somedir"
    val filePath2 = """c:\somedir\somedir"""
    val multilineString = """
        test
        test
        test
        test""".trimIndent()

    val multilineString2 = """test
        *test
        *test
        *test""".trimMargin("*")

    val multilineString3 = """test
        |test
        |test
        |test""".trimMargin()

    println(multilineString)
    println(multilineString2)
    println(multilineString3)
}