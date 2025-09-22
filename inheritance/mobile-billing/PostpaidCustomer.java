public class PostpaidCustomer extends customerId  {
    PostpaidCustomer(String customerId, String customerName, String phoneNumber, double balance) {
        super(customerId, customerName, phoneNumber, balance);
    }    
    @Override
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    @Override
    public void makeCall(double minutes) {
        double totalCost = minutes * costPerMinute;
        outstanding += totalCost; // Postpaid can go negative
        // if(outstanding > creditLimit) { // Optional: enforce a credit limit
        //     System.out.println("Credit limit exceeded.");
    }
    @Override
    public double getBalance() {
        return balance - outstanding;
    }
    @Override
    public String toString() {
        return "Postpaid " + super.toString();
    }
    private double outstanding = 0; // Amount to be paid at the end of the month
    
}
