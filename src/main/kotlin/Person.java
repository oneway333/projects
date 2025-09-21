package main.kotlin;

public class Person extends People2 implements People0{

    public static void main(String[] args) {

    }

    static class Shit {

        private String name;
        private int age;

        Shit(String name) {
            this.name = name;
        }

        Shit(int age) {
            this.age = age;
        }
    }

    @Override
    public void fuck(String name) {
        super.fuck(name);
    }
}

interface People0 {
    void fuck(String name);
}

abstract class People2 {
    public void fuck(String name) {
    }
}