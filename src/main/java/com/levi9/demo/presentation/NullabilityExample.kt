package com.levi9.demo.presentation

// show the compile error here
fun main(args: Array<String>) {
    val str: String
    val nullableStr: String?
    val nullableStr2 = null

//    str = null // - not allowed

    nullableStr = null

//    str = try {nullableStr!!} catch (e:Exception){""}
    str = nullableStr!!
    str = nullableStr2!!
    str.length


//    val l = if (b != null) b.length else -1

}

