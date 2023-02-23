package com.hdfc.bankapp;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("**** Welcome to HDFC Bank Atm ****");

        System.out.println("1 .Deposit");
        System.out.println("2 .Withdraw");
        System.out.println("3. Exit");

        Ibank bank = Util.getObject();

        Scanner sc = new Scanner(System.in);

        int service = sc.nextInt();

        switch (service) {
            case 1 -> bank.deposit();
            case 2 -> bank.withdraw();
            case 3 -> System.exit(0);
            default -> System.out.println("Invalid Case");
        }


    }
}
