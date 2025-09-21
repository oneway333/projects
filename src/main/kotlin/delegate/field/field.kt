package main.kotlin.delegate.field

import kotlin.reflect.KProperty

class Fucker {
    var name: String by Delegate()
}

class Delegate {
    operator fun getValue(fucker: Fucker, property: KProperty<*>): String {
        return "$fucker, ${property.name}"
    }

    operator fun setValue(fucker: Fucker, property: KProperty<*>, value: String) {
        println("fuck, $value")
    }
}

fun main() {
    val fucker = Fucker()
    println(fucker.name)

    fucker.name = "you"
    println(fucker.name)
}