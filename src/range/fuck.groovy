package range

import org.w3c.dom.ranges.Range

static void main(String[] args) {
//    fuck0()
//    fuck1()
    fuck2()
}

static def fuck2() {
    def range = 0..<10
    println range.contains(10)

    println range.get(1)

    IntRange fuck = 10..<0
    println fuck.isReverse()
}

static def fuck0() {
    for (i in 0..<10) {
        // 好傻逼，就双引号，能这么搞，$的东西
        println "i $i"
    }
}

static def fuck1() {
    def x = "123"
    def xx = "x: $x"
    println xx
}