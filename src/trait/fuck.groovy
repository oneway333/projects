package trait

class Fuck implements Fucker {
    def name;
    def age
}

trait Fucker {
    void fuck() {
        println 'fuck you'
    }
}

static void main(String[] args) {
    def fuck = new Fuck()
    fuck.name = 1
    fuck.age = 1
    fuck.fuck()
}