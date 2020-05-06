package io.deep27soft.udemy.kotlin.basic_03.operators

import io.deep27soft.udemy.kotlin.basic_03.equality.Employee

fun main(args: Array<String>) {

    val x = 0x00101101
    val y = 0x11011011

    x or y // ||
    x and y // &&

    val sth: Any = Employee("test", 1)
    if (sth is Employee) {
//        val newEmployee = sth as Employee
//        println(newEmployee.name)
        println(sth.name)
    }
    if (sth !is Employee) {

    }
}