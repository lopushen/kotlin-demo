package com.levi9.demo.presentation

import com.levi9.demo.app.domain.User

fun main(args: Array<String>) {
    val user = getSmth("user")
    if (user is User) println(user.name)
}

private fun getSmth(what: String): Any {
    return if (what=="user") User("John") else "smth"
}
