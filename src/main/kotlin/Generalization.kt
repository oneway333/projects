package main.kotlin

open class Generalization(str: String) {
    open val shit: Int = 123
    open fun fuck() = println("fuck you")
    fun damn() = println("damn")
}

open class Generalization1 {}

interface Generalization3 {
    val damn: String
    fun fuck() = println("fuck you")
    fun shit() = println("shit")
}

interface Generalization2 {
    val damn: String
    fun fuck() = println("fuck")
    fun shit() = println("shit")

}

class Child2(str: String) : Generalization(str), Generalization2, Generalization3 {
    override val damn: String = "fuck"

    override fun fuck() {
        super<Generalization2>.fuck()
    }

    override fun shit() {
        super<Generalization2>.shit()
        super.shit
    }
}

class Child0 : Generalization {
    constructor(str: String) : super(str) {

    }
}

class Child1 : Generalization1 {
    constructor() : super() {
    }
}

fun main() {
    val g = Generalization("fuck")

//    g.toString()
//    g.equals(g)

    println(g.hashCode())
}