package io.deep27soft.udemy.kotlin.datatypesandnulls_04.nullreferences

fun main(args: Array<String>) {

    val str: String? = null
//    str.toUpperCase()

//    if (str != null) {
//        str.toUpperCase()
//    }

    println(str?.toUpperCase())

//    val countryCode: String = bankBranch?.address?.country?.countryCode ?: "DefaultValue"

    val sth: Any = arrayOf(1, 2, 3, 4)
    val str3: String? = sth as? String
    println(str3)

    val str4: String? = "This isn't null"
    val str5 = str4!!.toUpperCase()


    val str6: String? = null
//    val str7 = str6!! // exception here
//    val str8 = str7.toUpperCase() // not here

//    printText(str6) // type mismatch

//    if (str6 != null) {
//        printText(str6)
//    }
    str?.let { printText(it) } // better do like this

    val str9: String? = null
    val str10 = "This is not null"
    println(str9 == str10)
}

fun printText(text: String) {
    println(text)
}
