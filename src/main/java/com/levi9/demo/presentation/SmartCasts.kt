package com.levi9.demo.presentation

import com.levi9.demo.app.domain.Record

fun main(args: Array<String>) {
    val record = getSmth("record")
    if (record is Record) println(record.name)
}

private fun getSmth(what: String): Any {
    return if (what=="record") Record("John") else "smth"
}
