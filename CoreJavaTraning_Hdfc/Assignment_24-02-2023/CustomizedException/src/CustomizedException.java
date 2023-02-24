public class CustomizedException {

    public static void main(String[] args) {

        int[] accounts = {111,2363,332,4303,5302};
        double [] balance = {5555,484865,848,23342,12};


        for (int i = 0; i < accounts.length; i++) {
            if (balance[i] < 1000){
                try {
                    throw new BalanceException("For account " + accounts[i] + " balance is low that is => " + balance[i]);

                }catch (BalanceException e){
                    System.out.println(e);
                }
            }else {
                System.out.println("For account " + accounts[i] + " balance is = " + balance[i]);
            }
        }

    }
}
