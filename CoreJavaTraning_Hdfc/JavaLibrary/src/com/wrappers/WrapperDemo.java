package com.wrappers;

public class WrapperDemo {
    public static void main(String[] args) {
        System.out.println(Integer.SIZE/8 + " bytes");
        System.out.println("Range of short :- "+Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        Integer I = Integer.valueOf("10");
        System.out.println(I);
    }
}
