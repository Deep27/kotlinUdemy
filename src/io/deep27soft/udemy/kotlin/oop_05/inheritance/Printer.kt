package io.deep27soft.udemy.kotlin.oop_05.inheritance

fun main(args: Array<String>) {

    val laserPrinter = LaserPrinter("Brother 1234")
    laserPrinter.printModel()
}

// open means extendable
// by default kotlin uses final
// open abstract ... (open is useless in this case)
abstract class Printer(val modelName: String) {

    // also use open for to be able to override
    open fun printModel() = println("The model name of this printer is $modelName")

    abstract fun bestSellingPrice(): Double
}

// using constructor invocation like this
class LaserPrinter(modelName: String) : Printer(modelName) {

    // always use override keyword
    override fun bestSellingPrice(): Double = 129.99

    override fun printModel() = println("The model name of THIS laser printer is $modelName")
}

// or like this
// compiler suggests converting to primary constructor
// like above
//class LaserPrinter : Printer {
//    constructor() : super()
//}
