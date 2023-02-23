public class BankAccount {
    private int accoutnNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public int getAccoutnNumber() {
        return accoutnNumber;
    }

    public void setAccoutnNumber(int accoutnNumber) {
        this.accoutnNumber = accoutnNumber;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        accountBalance = accountBalance + depositAmount;
        System.out.println("Deposit of amount " + depositAmount + " made sucessfully!!");
        System.out.println("Your new Balance is " + accountBalance);
    }

    public void withdraw(double withdrawAmount) {
        if(accountBalance - withdrawAmount < 0){
            System.out.println("Insufficient Funds in your account");
        }else{
            accountBalance-=withdrawAmount;
            System.out.println("WithDraw of rs " + withdrawAmount + " processed , Remaning balance = rs "+ accountBalance);
        }
    }


}
