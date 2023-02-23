public class Main {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);

        System.out.println("The high Score is " + highScore);
        System.out.println("The next Score is " + calculateScore(true, 10000, 8, 200));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final Score was " + finalScore);
        }
        return finalScore;
    }
}
