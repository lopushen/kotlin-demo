package com.levi9.demo.presentation

fun main(args: Array<String>) {

}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}


val <T> List<T>.lastIndex: Int
    get() = size - 1
