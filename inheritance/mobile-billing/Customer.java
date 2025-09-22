package inheritance.mobile-billing;

public class Customer {
    String customerId;
    String customerName;
    String phoneNumber;
    double balance;
    static double costPerMinute = 2.0; // Assume a fixed cost per minute
    Customer(String customerId, String customerName, String phoneNumber, double balance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }    
    public void credit(double amount) {
        // recharge or billPayment
    }
    public void makeCall(double minutes) {
        // TODO : if any common logic
        
    }
    public double getBalance() {
        return balance;
    }
    public String toString() {
        return "Customer ID: " + customerId + ", Customer Name: " + customerName
                + ", Phone Number: " + phoneNumber + ", Balance: " + balance;
    }
}
