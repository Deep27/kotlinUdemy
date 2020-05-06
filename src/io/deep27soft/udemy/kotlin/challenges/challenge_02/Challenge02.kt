package io.deep27soft.udemy.kotlin.challenges.challenge_02

import io.deep27soft.udemy.kotlin.challenges.challenge_02.javacode.Challenge02

fun main(args: Array<String>) {

    val float1 = -3847.384f
    val float2: Float = -3487.384f
//    val float3 = -3847.384.toFloat()

    val float3: Float? = float1
    val float4: Float? = float2

    val nonNullableShortArray = shortArrayOf(1, 2, 3, 4, 5)
    val nonNullableShortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    val nullableInts = Array(40) { i ->
        (i + 1) * 5
    }
    nullableInts.forEach { println(it) }

    val charArray = charArrayOf('a', 'b', 'c')
    Challenge02().method1(charArray)

    val x: String? = "I AM IN UPPERCASE"
    val lowercase = x?.toLowerCase() ?: "I give up!"

    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}
