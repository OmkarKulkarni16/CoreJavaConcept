import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a Number, or Character to exit :");
            String nextEntry = sc.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("no valid Data entered");
        }
    }
}
