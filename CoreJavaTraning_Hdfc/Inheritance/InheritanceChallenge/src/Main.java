public class Main {
    public static void main(String[] args) {
        Employee omkar = new Employee("Omkar", "16/02/2001", "01/01/2020");

        System.out.println(omkar);
        System.out.println("Age = " + omkar.getAge());
        System.out.println("Pay = " + omkar.collectPay());


        SalariedEmployee sahil = new SalariedEmployee("Sahil", "05/04/2000", "11/12/1995",55000);
        System.out.println("Sahil's payCheck = "+ sahil.collectPay());
        sahil.retire();
        System.out.println("Sahil's  pension pay = "+ sahil.collectPay());
        System.out.println("Sahi's retire date = ");

    }


}
