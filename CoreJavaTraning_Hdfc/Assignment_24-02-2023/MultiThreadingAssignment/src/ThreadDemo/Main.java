package ThreadDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Select Among The Two");
        System.out.println("1. Customer");
        System.out.println("2. Admin");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch (value){
            case 1 ->{
                Customer c = new Customer();
                Thread customer = new Thread(c);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Customer Name");
                String name = scanner.nextLine();
                c.setCustomerName(name);
                System.out.println("Enter Customer ID");
                Scanner scanner1 = new Scanner(System.in);
                int id = scanner1.nextInt();
                c.setCustomerId(id);
                customer.start();
            }
            case 2->{
                Admin a = new Admin();
                Thread admin = new Thread(a);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Admin Name");
                String name = scanner.nextLine();
                a.setAdminName(name);
                System.out.println("Enter Admin ID");
                Scanner scanner1 = new Scanner(System.in);
                int id = scanner1.nextInt();
                a.setAdminId(id);
                admin.start();
            }
        }
    }
}
