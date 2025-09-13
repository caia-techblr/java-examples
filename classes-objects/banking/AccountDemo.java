//package banking;

public class AccountDemo
{
    public static void main(String[] args)
    {
        Account acc1 = new Account("Alice", 5000);
        Account acc2 = new Account("Bob", 3000);
        
        acc1.deposit(1500); 
        System.out.println("Balance of Account 1: " + acc1.getBalance());

        acc2.withdraw(500);
        System.out.println("Balance of Account 2: " + acc2.getBalance());
        
        System.out.println("Account 1: " + acc1);
        System.out.println("Account 2: " + acc2);
    }
}
