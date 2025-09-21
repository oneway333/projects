package main.kotlin

fun main() {
    val dec = 33;
    val bin = "100001";
    val hex = "21";

    println("binToDec: ${binToDec(bin)}")
    println("decToBin: ${decToBin(dec)}")
    println("hexToDec: ${hexToDec(hex)}")
    println("decToHex: ${decToHex(dec)}")
    println("binToHex: ${binToHex(bin)}")
    println("hexToBin: ${hexToBin(hex)}")
}

// 2 -> 10
fun binToDec(bin: String): Int = bin.toInt(2)

// 10 -> 2
fun decToBin(dec: Int): String = dec.toString(2)

// 16 -> 10
fun hexToDec(hex: String): Int = hex.toInt(16)

// 10 -> 16
fun decToHex(dec: Int): String = dec.toString(16)

// 2 -> 16
fun binToHex(bin: String): String = bin.toInt(2).toString(16)

// 16 -> 2
fun hexToBin(hex: String): String = hex.toInt(16).toString(2)