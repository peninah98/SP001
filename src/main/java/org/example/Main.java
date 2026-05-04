package org.example;

import java.util.function.Function;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class Main {

    final String hello = "Hello, ";
    Function<String, String> helloFunction = (name) ->  hello + name;
    public  void main(String[] args) {
    System.out.println(helloFunction.apply("Penine"));
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}