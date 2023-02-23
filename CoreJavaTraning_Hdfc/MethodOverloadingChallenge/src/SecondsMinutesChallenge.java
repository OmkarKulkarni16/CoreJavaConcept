public class SecondsMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));


    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive value";
        } else {
//            int minutes = seconds / 60;
            return getDurationString(seconds/60, seconds%60);

        }

//        int hours = minutes /60;
//        System.out.println("hours = " + hours);
//
//        int remainingMin = minutes % 60;
////        System.out.println("minutes = "+ minutes);
////        System.out.println("remianingMinutes = "+ remainingMin);
//
//        int remainigSeconds = seconds % 60;
////        System.out.println("remaninigSeconds "+remainigSeconds);
//        return hours + "h " + remainingMin + "m " + remainigSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {


        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive value";
        }


        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds( " + seconds + ") , must be between 0 and 59";
        }
        int hours = minutes / 60;
//        System.out.println("hours = " + hours);

        int remainingMin = minutes % 60;
//        System.out.println("minutes = "+ minutes);
//        System.out.println("remianingMinutes = "+ remainingMin);

//        int remainigSeconds = seconds % 60;
//        System.out.println("remaninigSeconds "+remainigSeconds);
        return hours + "h " + remainingMin + "m " + seconds + "s";
    }
}
