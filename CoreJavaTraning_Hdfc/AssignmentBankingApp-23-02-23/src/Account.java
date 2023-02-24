import java.util.Random;

public class Account {

    private long accountNumber;
    private double accountBalance=500;
    private String accHolder;

    public Account( double accountBalance, String accHolder) {
        long generatedLong = new Random().nextLong();
        this.accountNumber = generatedLong;
        this.accountBalance = accountBalance;
        this.accHolder = accHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double balance) {
        this.accountBalance = balance;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }


    public void deposit(double amount){
        accountBalance = amount + accountBalance;
        System.out.println("Deposit of amount " + amount + " made sucessfully!!");
        System.out.println("Your new Balance is " + accountBalance);
    }

    public void withdraw(double withdrawAmount){
        if(accountBalance - withdrawAmount < 0){
            System.out.println("Insufficient Funds in your account");
        }else{
            accountBalance-=withdrawAmount;
            System.out.println("WithDraw of rs " + withdrawAmount + " processed , Remaning balance = rs "+ accountBalance);
        }
    }


    public double getBalance(){

        return accountBalance;
    }

    @Override
    public String toString() {
        return "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", accHolder='" + accHolder + '\'';
    }
}
