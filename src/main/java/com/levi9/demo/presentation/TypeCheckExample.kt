package com.levi9.demo.presentation

fun main(args: Array<String>) {
    checkIfString("hello, is this a String?")
    checkIfString(Employee(salary = 1200, name = "Jennifer"))
}

fun checkIfString(str: Any) {
    if (str is String) {
        println(str + " is String")
        str.substring(0, 5)
        val charArray = str.toCharArray()
        println(charArray.javaClass.kotlin)
    } else {
        println("You've passed not a String")
        println(str)
    }
}
