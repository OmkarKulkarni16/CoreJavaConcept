package com.input;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User ID");
        int id = sc.nextInt();
        sc.nextLine();// enter key will be handled
        System.out.println("Enter user name");
        String name = sc.nextLine();


        System.out.println("Enter amount");
        double amount = sc.nextDouble();


        System.out.println(id + " " + name + " " + amount);

    }
}
