package com.levi9.demo.presentation

import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    val b = "dwsdsds"
    val a: Int? = try {
        parseInt(b)
    } catch (e: NumberFormatException) {
        null
    }
    println(a)
}



