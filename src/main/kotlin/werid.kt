package main.kotlin

fun main() {
//    var shit: String? = null;
//    var shit2: String? = "null";
//    shit2?.toIntOrNull()

//    weirdRange()
//    weirdBaseType()

//    val dec = 123
//    println("dec $dec")
//
//    val lon = 123L
//    println("lon $lon")
//
//    // 竟然直接就把进制转换过来了，呢
//    val hex = 0xffffff
//    println("hex $hex")
//
//    val bin = 0b1001100
//    println("bin $bin")

//    var chr: Char = 'A';
//    println(chr.toInt())
//
//    chr = '\uFF00'
//    println(chr)

//    arr()

//    multiLine()

//    ifExpress("fuck")

//    anotherExpress()

    forEachExpress()
}

fun forEachExpress() {
    val arr: IntArray = IntArray(10)
    for (i in 0 until 10) arr.set(i, i)

    arr.forEach(fun(value: Int) {
        if (value == 1) return
        println(value)
    })
}

val shit = { }

fun anotherExpress() {
    // 好像，就不能这么，发散，了
//    val i = for (i in 1..2) {
//        1
//    }
}

fun ifExpress(str: String) {
    val fuck = if (str.length == 4) {
        "you"
    } else {
        "shit"
    }

    println("fuck $fuck")
}

fun multiLine() {
    val multi = """
        |fuck you
        |fuck you
        |fuck you
        |fuck you
    """

    println(multi)
    println(multi.trimIndent())
    println(multi.trimMargin(">>"))
}

fun weirdBaseType() {
    val intArray: IntArray = intArrayOf(1, 2, 3, 4)
    val doubleArray: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4)
    val floatArray: FloatArray = floatArrayOf(1f, 2f, 3f, 4f)

    println("intArray ${intArray.joinToString(", ")}")
    println("doubleArray ${doubleArray.joinToString(", ")}")
    println("floatArray ${floatArray.joinToString(", ")}")
}

fun weirdRange() {
    for (i in 1..4) print("$i ")
    println()
    for (i in 1..4 step 2) print("$i ")
    println()
    for (i in 1 until 10) print("$i ")
}

// 难道需要在其他情况下支持？
//fun << () {
//
//}

//fun []()

fun arr() {
    val a = arrayOf(1, 2, 3)
    println("a: ${a.joinToString(", ")}")

    val b = Array(3, { i -> (i + 1) })
    println("b ${b.joinToString(", ")}")

    b[2] = 99
    println("b ${b.joinToString(", ")}")
}