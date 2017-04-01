package com.levi9.demo.presentation

import com.levi9.demo.app.service.RecordService
import java.io.IOException
import java.lang.Integer.parseInt

fun main(args: Array<String>) {
    val b = "dwsdsds"
    val a: Int? = try { parseInt(b) } catch (e: NumberFormatException) { 0 }
    println(a)
    try {
        RecordService.throwAnException()
    } catch (e: IOException) {
        print("IO ex occurred")
    }

}



