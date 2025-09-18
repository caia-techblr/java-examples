package inheritance.banking;

public class CreditCardAccount extends Account 
{
    double creditLimit;
    double interestRate;
    CreditCardAccount(String customerName, double balance, double creditLimit, double interestRate)
    {
        super(customerName, balance);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }
    @Override
    public void credit(double amount)
    {
        if (amount > 0)
        {
            balance += amount; // balance = balance + amount
        }
    }

    @Override
    public void debit(double amount)
    {
        if (amount > 0 && amount <= (balance + creditLimit))
        {
            balance -= amount; // balance = balance - amount
        }
    }
    public void addInterest()
    {
        if (balance < 0)
        {
            double interest = (Math.abs(balance) * interestRate) / 100;
            balance -= interest; // balance = balance - interest
        }
    }
    public String toString()
    {
        return super.toString() + ", Credit Limit: " + creditLimit + ", Interest Rate: " + interestRate;
    }
    
}
