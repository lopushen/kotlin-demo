package com.levi9.demo.presentation


fun callElvis(str: String?) {
    val value = str ?: "you've passed null"
    // val value = str!=null ? str : "you've passed null"
    println(value)
}

fun main(args: Array<String>) {
    callElvis("asasasa")
    callElvis("")
    callElvis(null)
}