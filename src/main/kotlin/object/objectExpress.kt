package main.kotlin.`object`

fun main() {
//    val fuck = Fuck()
//
//    fuck.call()

//    val fuck = Fuck1()
//    fuck.fuck("you")
//
//    Fuck1.fuck("you")

    fuck(object : Fucker(name = "you", age = 33) {
        override fun action(string: String) {
            println("fuck $string $name $age")
        }
    })
}

fun fuck(fucker: Fucker) {
    // do something, 有个结果
    val res = "shit"
    fucker.action(res)
}

open class Fucker(var name: String, var age: Int) {

    open fun action(string: String) {
    }
}

class Fuck1 {
    fun fuck(string: String) = println("$string fuck")

    companion object Shit {
        fun fuck(string: String) = println("fuck $string")
    }

//    companion object Fucker {
//
//    }

}

class Fuck {
    private fun fuck() = object {
        fun fuck(string: String) = println("fuck $string")

        val name: String = "123"
    }

    public fun shit() = object {
        fun fuck(string: String) = println("fuck $string")

        val name: String = "123"
            get() = field
    }

    fun call() {
//        fuck().name
//        shit().name
        invoke()()

//        shit().name = "fuck"
    }

    fun invoke() = {
        println("fuck")

        val x = 1

        class Shit {
            fun call() {
                println(this.javaClass.canonicalName)
            }
        }

        Shit().call()
    }

}