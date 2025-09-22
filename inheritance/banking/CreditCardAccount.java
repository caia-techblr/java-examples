package inheritance.banking;

public class CreditCardAccount extends Account 
{
    double creditLimit;
    double interestRate;
    CreditCardAccount(String customerName, double balance, double creditLimit, double interestRate)
    {
        // TODO : implement constructor
    }
    @Override
    public void credit(double amount)
    {
       // TODO : implement credit
    }

    @Override
    public void debit(double amount)
    {
        // TODO : implement debit
    }
    public void addInterest()
    {
        // TODO : implement addInterest
    }
    public String toString()
    {
        return super.toString() + ", Credit Limit: " + creditLimit + ", Interest Rate: " + interestRate;
    }
    
}
