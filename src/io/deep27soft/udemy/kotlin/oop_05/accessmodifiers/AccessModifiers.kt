package io.deep27soft.udemy.kotlin.oop_05.accessmodifiers

const val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println(MY_CONSTANT)

    val emp = Employee("John")
    println(emp.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)


    val car = Car("blue", "Toyota", 2015)
    println(car)
    val car2 = Car("blue", "Toyota", 2015)
    println(car2)
    println(car == car2)

    val car3 = car.copy()
    println(car3)

    val car4 = car.copy(year = 2016, color = "green")
    println(car4)

    val emp4 = Employee("John")
    println(emp == emp4)
}

// in kotlin fields and getters and setters must have the same visibility level

class Employee (val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() { // custom setter used right after field declaration
        println("Running the custom get")
        return field
    }
    set(value) { // custom setter used right after field declaration
        println("Running the custom set")
        field = value
    }
}

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}

// multiple constructors attempt 1
//class Employee (val firstName: String, val fullTime: Boolean) {
//
//    constructor(firstName: String): this(firstName, true) {
//    }
//}

class ClassWithProtectedConstructor protected constructor (val firstName: String) {

}


// 2nd attempt
//class Employee constructor(firstName: String) {
//
//    val firstName: String = firstName
//}


// 1st attempt
// primary constructor
//class Employee constructor(firstName: String) {
//
//    val firstName: String
//
//
//    // used in conjunction with primary constructor
//    init {
//        this.firstName = firstName
//    }
//}

data class Car(val color: String, val model: String, val year: Int) {

}
