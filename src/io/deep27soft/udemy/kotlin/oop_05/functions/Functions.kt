package io.deep27soft.udemy.kotlin.oop_05.functions

import io.deep27soft.udemy.kotlin.oop_05.upperFirstAndLast

fun main(args: Array<String>) {
    println(labelMultiply(label = "Here's the result:", operand2 = 3, operand1 = 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

//    functionCall(1, 2, 3, 4, 5, 6)

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("purple", "Zhiguli", 2002)
    val car3 = Car("grey", "Ford", 2017)

//    printColors(car1, car2, car3, "Some string") // doesn't work (type mismatch)
    printColors(car1, car2, car3, str = "Some string") // doesn't work (type mismatch)

    val manyCars = arrayOf(car1, car2, car3)

    printColors(*manyCars) // spread operator

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
//    val lotsOfCars = arrayOf(manyCars, moreCars, car4) // not what we wanted to have
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }



//    // Java style Utils class with static method
//    println(Utils().upperFirstAndLast("this is all in lowercase"))


    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

// inline ??
fun printColors(vararg cars: Car, str: String) {
    for (car in cars) {
        println(car.color)
    }
}

//fun whatever(): Unit = 3 * 4 // type mismatch

fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is:") = "$label ${operand1 * operand2}"

class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int) {

}
