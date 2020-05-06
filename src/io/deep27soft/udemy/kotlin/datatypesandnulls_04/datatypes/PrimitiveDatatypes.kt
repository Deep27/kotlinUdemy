package io.deep27soft.udemy.kotlin.datatypesandnulls_04.datatypes

import io.deep27soft.udemy.kotlin.datatypesandnulls_04.datatypes.javacode.PrimitiveDatatypes

fun main(args: Array<String>) {

    val myInt = 10
    println("Default Java datatype is ${myInt::class.java}")
    println("Default Kotlin datatype is ${myInt::class}")
    val myLong = 22L
//    val myLong: Long = 22

//    myLong = myInt.toLong() // if myLong was var

    val myByte: Byte = 111
    val myShort: Short = myByte.toShort()

    val anotherInt = 5

    var myDouble = 2.71828
    println(myDouble is Double) // compiler: remove useless check

    val myFloat = 3.141f
    myDouble = myFloat.toDouble()

    val char = 'b'
//    val char2: Char = 123
    val myCharInt = 65
    println(myCharInt.toChar())

    val bool = true
    val vacationTime = false
    val onVacation = PrimitiveDatatypes().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any
}

fun infiniteLoop(): Nothing {
    while (true) {

    }
}