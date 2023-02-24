public class Main {
    public static void main(String[] args) {
         Person smith = new Person("smith",21);
        Account smithAccount = new Account(500,"Smith");
        System.out.println(smith);
        System.out.println(smithAccount);
        smithAccount.deposit(2000);
        smithAccount.withdraw(1000);


    }
}
