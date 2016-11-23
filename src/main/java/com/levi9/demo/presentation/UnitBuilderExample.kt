package com.levi9.demo.presentation


fun main(args: Array<String>) {
    Employee(name = "John", salary = 100).apply {
        println(this)
//        name should be a var in the data class
//        this.name = "Not a John"
//        println(this)

        println(theAnswer())
        println(theCustomAnswer(2, 3))
    }
}

// the single-expression function
fun theAnswer() = 42

fun theCustomAnswer(a: Int, b: Int) = a + b