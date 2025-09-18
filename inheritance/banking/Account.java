public class Account
{
    String customerId;
    String customerName;
    double balance;
    static int nextCustomerId = 1000;
    Account()
    {
        customerId = "ACCT" + nextCustomerId;
        nextCustomerId++;
    }
    Account(String customerName, double balance)
    {
        this();
        this.customerName = customerName;
        this.balance = balance;
    }
    public void credit(double amount)
    {
        // Dummy comment
    }
    public void debit(double amount)
    {
        // Dummy comment
    }
    public double getBalance()
    {
        return balance;
    }
    public String toString()
    {
        return "Account Number: " + customerId + ", Customer Name: " + customerName + ", Balance: " + balance;
    }
    
}