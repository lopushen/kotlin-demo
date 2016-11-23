package com.levi9.demo.presentation

import java.lang.Integer.parseInt


//val Foo.bar = 1 // error: initializers are not allowed for extension properties

//var a: String = "abc"
//a = null // compilation error
//
//var b: String? = "abc"
//b = null // ok
//
//
////val l = b.length // error: variable 'b' can be null
//
//
//val l = b!!.length

val b = "saasa"
val l = b?.length

val a: Int? = try {
    parseInt("1")
} catch (e: NumberFormatException) {
    null
}



