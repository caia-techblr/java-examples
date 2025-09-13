//package banking;

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
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }
    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;      
        }
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