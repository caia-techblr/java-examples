import inheritance.banking.CreditCardAccount;

public class BankingDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("John Doe", 1000, 5);
        System.out.println(sa);
        sa.credit(500); // Deposit
        System.out.println("After crediting $500: " + sa);
        sa.debit(200); // Withdraw
        System.out.println("After debiting $200: " + sa);
        //sa.addInterest(); // Add interest
        //System.out.println("After adding interest: " + sa);

        CreditCardAccount cca = new CreditCardAccount("Jane Doe", 2000, 15, 5000);
        System.out.println(cca);
        cca.credit(1000); // Payment
        System.out.println("After crediting $1000: " + cca);
        cca.debit(300); // Purchase
        System.out.println("After debiting $300: " + cca);
        cca.debit(6000); // Attempt to exceed credit limit
        System.out.println("After attempting to debit $6000: " + cca);  
        
        Account acc;
        int choice = 1; // Assume user input is 1 for SavingsAccount, 2 for CreditCardAccount
        if(choice==1) 
            acc = new SavingsAccount("Alice", 1500, 3);
        else
            acc = new CreditCardAccount("Bob", 2500, 12, 4000);
        System.out.println("Account Details: " + acc);
        acc.credit(200); // Common operation, dynamic binding
        System.out.println("After crediting $200: " + acc);
        acc.debit(100); // Common operation, dynamic binding
        System.out.println("After debiting $100: " + acc);      

    }

}
