public class SwitchCase {
    public static void main(String[] args) {


        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value is 2");
            case 3 -> System.out.println("Value is 3");
            default -> System.out.println("No such Case");
        }
        System.out.println(getQuarter("January"));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" ->{yield  "1st";}
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
