package ThreadDemo;

public class Customer extends User{
    private int customerId;
    private String customerName;



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
       super.setId(customerId);
        this.customerId = customerId;

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        super.setName(customerName);
        this.customerName = customerName;
    }
}
