package inheritance.banking;

public class SavingsAccount extends Account
{
    double interestRate;
    SavingsAccount(String customerName, double balance, double interestRate)
    {
        super(customerName, balance);
        this.interestRate = interestRate;
    }
    public void addInterest()
    {
        double interest = (balance * interestRate) / 100;
        debit(interest);
    }
    @Override
    public void credit(double amount)  //bill payment
    {
        if (amount > 0)
        {
            balance += amount;  
        }
    }

    @Override
    public void debit(double amount)  //purchase
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;  
        }
    }
    public String toString()
    {
        return super.toString() + ", Interest Rate: " + interestRate;
    }
    
}
