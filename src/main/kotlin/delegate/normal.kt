package main.kotlin.delegate

fun main() {
    val fucker = Fucker(FuckImpl("you"))
    fucker.fuck()
}

interface Fuck {
    fun fuck()
}

// 这里就，很SB呀，为什么一定得主动声明成val，呢
class FuckImpl(val name: String) : Fuck {

    override fun fuck() {
        println("fuck $name")
    }
}

class Fucker(fuck: Fuck) : Fuck by fuck