package org.example;

class A implements  Runnable {
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

class B implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class Main {
    public static void main(String[] args) {
//        A obj1 = new A();
//        B obj2 = new B();

        Runnable obj1 = new A();
        Runnable obj2 = new B();

//        obj2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(obj1.getPriority());

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}