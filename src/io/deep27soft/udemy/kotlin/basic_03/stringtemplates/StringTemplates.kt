package io.deep27soft.udemy.kotlin.basic_03.stringtemplates

import io.deep27soft.udemy.kotlin.basic_03.equality.Employee

fun main(args: Array<String>) {

    val employee1 = Employee("Lynn Jones", 500)
    println(employee1)

    val change = 4.22
    println("Change: \$$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")
}