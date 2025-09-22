public class PrepaidCustomer extends Customer {
    PrepaidCustomer(String customerId, String customerName, String phoneNumber, double balance) {
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
        if (totalCost > 0 && totalCost <= balance) {
            usage += totalCost;
        } else {
            System.out.println("Insufficient balance to make the call.");
        }
    }

    @Override
    public double getBalance() {
        return balance - usage;
    }
    @Override
    public String toString() {
        return "Prepaid " + super.toString();
    }
    private double usage = 0;
    
}
