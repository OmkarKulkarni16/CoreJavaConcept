package com.demo;

public class MyThreadDemo {

    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        t1.start();
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Main Thread");
        }

    }
}
