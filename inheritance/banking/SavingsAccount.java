package inheritance.banking;

public class SavingsAccount extends Account
{
    double interestRate;
    SavingsAccount(String customerName, double balance, double interestRate)
    {
        // TODO : implement constructor
    }
    public void addInterest()
    {
        // TODO : implement addInterest
    }
    @Override
    public void credit(double amount)  //bill payment
    {
        // TODO : implement credit
    }

    @Override
    public void debit(double amount)  //purchase
    {
        // TODO : implement debit
    }
    public String toString()
    {
        return super.toString() + ", Interest Rate: " + interestRate;
    }
    
}
