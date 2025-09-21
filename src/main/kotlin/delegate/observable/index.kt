package main.kotlin.delegate.observable

import kotlin.properties.Delegates

class Fucker {
    var shit: String by Delegates.observable("init value") { property, oldValue, newValue ->
        println("${property.name}: $oldValue -> $newValue")
    }
}

fun main() {
    val fucker = Fucker()

    fucker.shit = "you"
    fucker.shit = "shit"
}