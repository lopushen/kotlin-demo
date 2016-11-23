package com.levi9.demo.presentation

import com.levi9.demo.app.domain.User

fun main(args: Array<String>) {
    val users = UserPair(User(), User())
    users[2]
    users[1]
}

data class UserPair(val user1: User, val user2: User) {
    operator fun get(position: Int): User {
        if (position === 1) {
            println("Getting user 1")
            return user1
        }
        if (position === 2) {
            println("Getting user 2")
            return user2
        }
        throw IllegalArgumentException("The index is not correct")
    }
}