package org.example;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());

        obj1.start();
        obj2.start();
    }
}