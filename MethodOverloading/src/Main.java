public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Omkar", 500);
//        System.out.println("New Score  " + newScore);
//        calculateScore(75);
        System.out.println("New Score is "+ calculateScore("Omkar" , 500));
        System.out.println("New Score is "+calculateScore(10));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {
//        System.out.println("Player  Unnamed " + score + " points ");
//        return score * 1000;
        return  calculateScore("Anonymus" , score);
    }


}
