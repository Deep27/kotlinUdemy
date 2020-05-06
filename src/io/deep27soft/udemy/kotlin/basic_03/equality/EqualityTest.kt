package io.deep27soft.udemy.kotlin.basic_03.equality

fun main(args: Array<String>) {

    val employee1 = Employee("Mary", 1)
    val employee2 = Employee("John", 2)
    val employee3 = Employee("John", 2)

    println(employee1 == employee2) // false
    println(employee2 == employee3) // true
    println(employee1.equals(employee2)) // false
    println(employee2.equals(employee3)) // true

    println(employee1 === employee2) // false
    println(employee2 === employee3) // false
    val employee4 = employee3
    println(employee4 === employee3) // true

    println(employee4 != employee2) // false
    println(employee2 !== employee2) // false
    println(employee2 != employee3) // false
    println(employee2 !== employee3) // true
}