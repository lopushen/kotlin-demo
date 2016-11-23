package com.levi9.demo.presentation

fun main(args: Array<String>) {
//    val (name, money) = Employee("Peter", 1000)
//    println(name)
//    println(money)
    val emp = Employee("Peter", 1000)
    dest(emp)
    dest2(emp)
}

fun dest(employee: Employee) {
    val (name, money) = employee
    println(name)
    println(money)
}


fun dest2(employee: Employee) {

    println(employee.component1())
    println(employee.component2())

}