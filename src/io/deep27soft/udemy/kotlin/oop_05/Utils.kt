package io.deep27soft.udemy.kotlin.oop_05

// ILLUSION ???
// String is a receiver type
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.length - 1,
        upperFirst.length
    ).toUpperCase()
}

// Java style utils class (could've been object)
//class Utils {
//
//    fun upperFirstAndLast(str: String): String {
//        val upperFirst = str.substring(0, 1).toUpperCase() + str.substring(1)
//        return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
//            upperFirst.length - 1,
//            upperFirst.length
//        ).toUpperCase()
//    }
//}