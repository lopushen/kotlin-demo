package com.levi9.demo.presentation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val lazyEmployee = LazyEmployee("John", 1000)

    println(lazyEmployee.localTax)

    lazyEmployee.localTax = 0.4
    println(lazyEmployee.localTax)

    println(lazyEmployee.federalTax)
    println(lazyEmployee.observableStatus)
    lazyEmployee.observableStatus = "Boss"

}

data class LazyEmployee(val name: String, val salary: Int) {
    val federalTax: Double by lazy {
        println("Getting the tax data from some slow API...")
        Thread.sleep(3000)
        0.3
    }
    var localTax by TaxDelegate()

    var observableStatus: String by Delegates.observable("The status observable has been invoked") {
        prop, old, new ->
        println("$prop has changed from $old to $new")
    }

}

class TaxDelegate {
    operator fun getValue(thisRef: Any?, thisProp: KProperty<*>): Double {
        return 0.1
    }

    operator fun setValue(thisRef: Any?, thisProp: KProperty<*>, value: Double) {
        println("Setting tax property...")
        println("$value has been assigned to $thisProp in $thisRef")
    }
}