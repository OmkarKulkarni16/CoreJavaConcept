package com.demo;

public class DemoImplementation implements MyInterface {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyInterface mi = new DemoImplementation();//object holding in interface variable

        System.out.println(mi.add(2, 4));
    }
}
