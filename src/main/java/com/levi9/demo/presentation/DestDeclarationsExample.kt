package com.levi9.demo.presentation

fun main(args: Array<String>) {
    val (name, money) = Employee("Peter", 1000)
    println(name)
    println(money)
    val emp = Employee("Peter", 1000)
    printByComponent(emp)

    val(name1, money1) = constructEmployee(name, money)

    println(name1)
    println(money1)
}

fun printByComponent(employee: Employee) {
    println(employee.component1())
    println(employee.component2())
}

fun constructEmployee (name: String, money: Int):Employee {
        return Employee(name, money)
}