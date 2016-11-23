package com.levi9.demo.presentation


fun main(args: Array<String>) {
    val employee = Employee("John", 1000)

    val employee2 = Employee("Jack", 2000)

    println(employee < employee2)
    println(employee > employee2)
}

data class Employee(var name: String, val salary: Int) {

    operator fun compareTo(user2: Employee): Int {
        if (user2.salary > salary) {
            return -1
        } else if (user2.salary < salary) {
            return 1
        }
        return 0
    }
}
