package main.kotlin

fun main() {
//    val fuck = Fucker0()
//    fuck.fuck("you")

    val fucker1 = Fucker1()
    val fucker2 = Fucker2()
    fucker1.call(fucker2)
}

class Fucker2 {
    fun fuck(str: String) {
        println("${this.javaClass.simpleName} fuck $str")
    }
}

class Fucker1 {
    fun fuck(str: String) {
        println("${this.javaClass.simpleName} fuck $str")
    }

    fun Fucker2.shit(str: String) {
        fuck(str)
        this@Fucker1.fuck(str)
        this.fuck(str) // 这个this，竟然指向的是Fucker，呢。太JB屌了
    }

    fun call(f: Fucker2) {
        f.shit("you")
    }
}


class Fucker0 {
    var damn: Int = 1
}

var Fucker0.shit: Int
    get() = damn + 1
    set(value) {
        damn = value
    }

fun Fucker0.fuck(str: String) {
    println("fuck $str")
}