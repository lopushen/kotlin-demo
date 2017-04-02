package com.levi9.demo.presentation

// show the compile error here
fun main(args: Array<String>) {
    var str: String
    val nullableStr: String?
    val nullableStr2 = null

//    str = nullableStr2!!
//    str = null // - not allowed

    nullableStr = null

    str = try {nullableStr!!} catch (e:Exception){""}

    str!!.length
//    val len: Int?
//    val b = listOf(1,2,3,4)
//    val l = if (b != null) b.size else -1
//    l = len

}

