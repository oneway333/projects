package main.kotlin

import fuck.shit.Damn
import java.util.*;
import kotlin.math.abs
import kotlin.reflect.KClass


class Fuck {
}

fun test() {
    val damn = Class.forName("fuck.shit.Damn")
    println(damn)
//    println(damn.members)
    println(damn.simpleName)
    val instance = damn.newInstance() as Damn
    println(instance)
    instance.shit()
}

fun main() {
//    test()

//    test2()

    fun minus(a: Int, b: Int): Int {
        return abs(a - b);
    }

//    println(minus(1, 2))
//    println(divide(1, 2))

//    vars(1, 2, 3, 4)

    val shit: (Int, Int) -> Int = { x, y -> x + y }
//    println(shit(1, 2))

    var f = 123

    println("f is $f is ${f}")
    println("${shit(1, 2)}")
}

fun test2() {
    val arr = intArrayOf(1, 2, 3);
}

fun multi(a: Int, b: Int) = a * b

public fun divide(a: Int, b: Int) = a / b

fun vars(vararg i: Int) {
    for (item in i) {
        println(item)
    }
}

