package com.hdfc;

public class DataTypeDemo {
    public static void main(String[] args) {

        byte b = 50;

        System.out.println("Byte Range : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);


        int x = (int) 2147483650l;
        System.out.println(x);

        byte byteVariable = (byte) 129;
        System.out.println(byteVariable);


        DataTypeDemo d1 = new DataTypeDemo();
        System.out.println(d1);

    }
}
