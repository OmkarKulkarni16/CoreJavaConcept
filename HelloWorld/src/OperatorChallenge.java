public class OperatorChallenge {
    public static void main(String[] args) {
        double firstVar = 20.00d;
        double secondVar = 80.00d;

        double thirdVar = (firstVar+secondVar)*100.00d;

        double remainder = thirdVar % 40.00d;

        boolean booleanVar = remainder == 0.00 ? true : false;

        System.out.println(booleanVar);

        if(booleanVar){
            System.out.println("got some remainder");
        }
    }
}
