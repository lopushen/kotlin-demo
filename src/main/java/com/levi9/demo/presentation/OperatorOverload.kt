package com.levi9.demo.presentation

import com.levi9.demo.app.domain.Record

fun main(args: Array<String>) {
    val records = recordPair(Record(), Record())
    records[2]
    records[1]
//    records[3]

    // equivalent
    println(4 _x3 4)
    println(4._x3(4))
}

data class recordPair(val record1: Record, val record2: Record) {
    operator fun get(position: Int): Record {
        if (position === 1) {
            println("Getting record 1")
            return record1
        }
        if (position === 2) {
            println("Getting record 2")
            return record2
        }
        throw IllegalArgumentException("The index is not correct")
    }
}

infix fun Int._x3(x:Int):Int {
    return this*x*3
}