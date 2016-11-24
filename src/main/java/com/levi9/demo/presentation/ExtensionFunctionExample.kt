package com.levi9.demo.presentation

fun main(args: Array<String>) {
    val list = mutableListOf(1,2,3)

    println(list)

    list.swap(0,1)
    println(list)

    // WTF here if use String template the property does not work
    // println("the last index is $list.lastIndex")
    // but this works - calling method
//    println("the last element is ${list.last()}")
    println("the last index is " +list.lastIndex)


}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}


val <T> List<T>.lastIndex: Int
    get() = size - 1
