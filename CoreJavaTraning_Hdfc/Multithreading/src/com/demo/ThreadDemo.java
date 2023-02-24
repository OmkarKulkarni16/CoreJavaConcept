package com.demo;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        System.out.println(t1);
//
//        t1.setPriority(NORM_PRIORITY);
//        t1.setName("child");
//        System.out.println(t1.getName() + " " + t1.getState());

        System.out.println(Thread.currentThread().getName()+" Thread excecuting ");

        t1.start();
    }

    public void run() {
        System.out.println("run() method executed");
    }
}
