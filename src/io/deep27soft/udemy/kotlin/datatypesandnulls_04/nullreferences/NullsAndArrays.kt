package io.deep27soft.udemy.kotlin.datatypesandnulls_04.nullreferences

fun main(args: Array<String>) {

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())
}
