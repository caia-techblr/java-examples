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
    public void recharge(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void makeCall(double minutes) {
        double totalCost = minutes * costPerMinute;
        if (totalCost > 0 && totalCost <= balance) {
            balance -= totalCost;
        }
    }
    public double getBalance() {
        return balance;
    }
    public String toString() {
        return "Customer ID: " + customerId + ", Customer Name: " + customerName
                + ", Phone Number: " + phoneNumber + ", Balance: " + balance;
    }
}
