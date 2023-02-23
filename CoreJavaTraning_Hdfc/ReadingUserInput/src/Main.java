import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear));

        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
        System.out.println(getInputFromScanner(currentYear));
    }
//        String usersDateOfBirth = "1999";
//
//        System.out.println("Age = " + (Integer.parseInt(currentYear)-Integer.parseInt(usersDateOfBirth)));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi What's Your Name ");
        System.out.println("Hi " + name);

        String dateOfBirth = System.console().readLine("What  year you were born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old ";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi What's Your Name ");
        System.out.println("Hi , What's Your Name ? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);

        System.out.println("What year you were born ");
        boolean validDob = false;
        int age = 0;

        do {
            System.out.println("Enter a Year of Birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
//            String dateOfBirth = scanner.nextLine();
//            age = currentYear - Integer.parseInt(dateOfBirth);
            age = checkData(currentYear, scanner.nextLine());
            validDob = age < 0 ? false : true;
        } while (!validDob);

        return "So you are " + age + " years old ";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}

