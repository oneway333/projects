package main.kotlin.generics

fun main() {
    val fucker = Fucker<String>()
    fucker.fuck("fuck")
    fuck(123)
}

class Fucker<T> {

    fun fuck(arg: T) {
        println(arg)
    }
}

fun <T> fuck(str: T) {
    println(str)
}

