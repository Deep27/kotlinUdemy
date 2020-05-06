package io.deep27soft.udemy.kotlin.datatypesandnulls_04.datatypes

import io.deep27soft.udemy.kotlin.datatypesandnulls_04.datatypes.javacode.ArrayDT
import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("John", "Jane", "Jill", "Joe")
    val longs = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    println(names[0])

    val evenNumbers = Array(16) {
        i -> i * 2
    }

    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(100000) {
        i -> i + 1
    }

    val allZeros = Array(100) { 0 }

    var someArray: Array<Int> = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) {
        i -> (i + 1) * 10
    }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array<Any>) // true



    val myIntArray = arrayOf(3, 9, 434, 2, 33)
    ArrayDT().printNumbers(myIntArray.toIntArray())

//    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
//    ArrayDT().printNumbers(myIntArray)

//    var someOtherArray = Array<Int>(5)
    var someOtherArray = IntArray(5)
    var array1: Array<Int>

    ArrayDT().printNumbers(evenNumbers.toIntArray())

    val intArr = intArrayOf(3, 2, 1, 0)
    val convertedIntArray = intArr.toTypedArray()
}
