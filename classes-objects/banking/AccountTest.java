//package banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccountConstructorAndGetBalance() {
        Account acc = new Account("2001", "Charlie", 2500.0);
        assertEquals(2500.0, acc.getBalance(), 0.001);
        assertEquals("Charlie", acc.customerName);
        assertEquals("2001", acc.customerId);
    }

    @Test
    void testDepositPositiveAmount() {
        Account acc = new Account("2002", "David", 1000.0);
        acc.deposit(500.0);
        assertEquals(1500.0, acc.getBalance(), 0.001);
    }

    @Test
    void testDepositNegativeAmount() {
        Account acc = new Account("2003", "Eve", 1000.0);
        acc.deposit(-100.0);
        assertEquals(1000.0, acc.getBalance(), 0.001);
    }

    @Test
    void testWithdrawValidAmount() {
        Account acc = new Account("2004", "Frank", 2000.0);
        acc.withdraw(500.0);
        assertEquals(1500.0, acc.getBalance(), 0.001);
    }

    @Test
    void testWithdrawInvalidAmount() {
        Account acc = new Account("2005", "Grace", 1000.0);
        acc.withdraw(1500.0); // More than balance
        assertEquals(1000.0, acc.getBalance(), 0.001);
        acc.withdraw(-100.0); // Negative amount
        assertEquals(1000.0, acc.getBalance(), 0.001);
    }

    @Test
    void testToStringFormat() {
        Account acc = new Account("2006", "Heidi", 3000.0);
        String str = acc.toString();
        assertTrue(str.contains("Account Number: 2006"));
        assertTrue(str.contains("Customer Name: Heidi"));
        assertTrue(str.contains("Balance: 3000.0"));
    }
}