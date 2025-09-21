package main.kotlin

fun main() {

//    whenExpress("fuck")

    val arr: IntArray = intArrayOf(1, 2, 3, 4)
//    forArrExpress()

//    withIndexExpress(arr)

//    labelExpress(arr)

//    implicitExpress(arr)

    val shit = Shit("123")
    println(shit.damn)
}

open class Fuck0 {

    var name: String = ""
    var age: Int = 0


    constructor(name: String) {
        this.name = name
    }

    constructor(age: Int) {
        this.age = age
    }

    constructor(name: String, age: Int): this(name) {

    }
}

class People(val firstName: String = "fuck", var lastName: String) {
    //...
}

class Shit(var str: String) { // 这里的str，已经进行了初始化
    init {
        str += "123"
    }

    var damn = str
        get() = field + "shit"
        set


    fun shit() {

    }

    constructor(str: String, dec: Int): this(str) {

    }

}

fun implicitExpress(arr: IntArray) {
    arr.forEach {
        if (it == 3) return@forEach
        println(it)
    }
}

fun labelExpress(arr: IntArray) {
    arr.forEach lit@{
        if (it == 2) return@lit
        println(it)
    }
}

fun withIndexExpress(arr: IntArray) {

    for ((index, value) in arr.withIndex()) {
        println("arr[$index]: $value")
    }
}

fun forArrExpress() {
    val arr = arrayOf(1, 2, 3)

    // 超级，诡异，呢
    for (i in arr.indices) {
        println(arr[i])
    }
}

fun whenExpress(str: Any) {

    val fuck = when (str) {
        is String -> {
            println("$str is String")
        }

        else -> println("$str is Any")
    }

    println(fuck)
}

