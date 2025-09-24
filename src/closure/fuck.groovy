package closure

static void main(String[] args) {
//    fuck0()
//    fuck1()
//    fuck2()
    fuck3()
}

static void fuck3() {
    Fuck fuck = new Fuck()
    fuck.fuck (... arg) -> {
        println arg
    }

    // 原来，还可以，这么些，真是，操了
    fuck.fuck {
        (... arg) -> {
            for (i in arg) {
                println "i $i"
            }
        }
    }
}

class Fuck {

    void fuck(Closure<?> closure) {
        closure.call(1, 2, 3)
    }
}

static void fuck2() {
    def map = ["name": 'oneway', 'age': 123]
    map.each { println it }
}

static void fuck1() {
    def f1 = (fn) -> { fn.call() }
    def f2 = { it.call() }
    def f3 = { fn -> fn.call() }

    f1({ println 'fuck you' })
    f2({ println 'fuck you too' })
    f3({ println 'mother fucker' })
}

static void fuck0() {
    def fun = { println 'fuck you' }
    def fun1 = () -> { println 'fuck you too' }

    def sum = (a, b) -> a + b

    fun()
    fun.call()

    fun1()

    println sum(1, 2)
    println sum.call(2, 3)
}