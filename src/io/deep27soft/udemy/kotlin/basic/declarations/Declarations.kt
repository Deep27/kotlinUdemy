package io.deep27soft.udemy.kotlin.basic.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val number = 25
    val number2: Short = 20

    val number3: Int
    number3 = 10
//    number3 = 20

    var number4: Int
    number4 = 10
    number4 = 15

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"
//    employee1.id = 10
//    employee1 = Employee("Tim Watson", 100)
    val employee2: Employee
    val number5 = 100
    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }

//    @SinceKotlin("1.1") public actual typealias StringBuilder = java.lang.StringBuilder
//    StringBuilder

    val employees: EmployeeSet

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])
}

class Employee(var name: String, val id: Int)