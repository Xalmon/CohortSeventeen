package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {
    @Test
    public void testRegister() {
        Bank bank = new Bank();
        bank.register("Baba", "Solo", "1234");
        assertEquals("Baba Solo 1234", "1111 Solo 1234");
    }


    @Test
    public void deposit() {
        Bank bank = new Bank();
        bank.deposit(1000);
        int currentBalance = bank.getBalance();
        assertEquals(1000, currentBalance);
        bank.deposit(-2000);
        int newBalance = bank.getBalance();
        assertEquals(1000, newBalance);
    }

    @Test
    public void withdraw() {
        Account bank = new Account();
        bank.deposit(5000);
        int currentBalance = bank.getBalance();
        assertEquals(5000, currentBalance);
        bank.withdraw(2000, bank.getPin());
        int newBalance = bank.getBalance();
        assertEquals(3000, newBalance);
    }

//    @Test
//    public void transferTest() {
//        Account fromAccount = new Account();
//        fromAccount.deposit(5000);
//        Account toAccount = new Account();
//        int transferAmount = 2000;
//        fromAccount.transfer(transferAmount, fromAccount.getPin(), toAccount.getPin());
//        int fromAccountBalance = fromAccount.getBalance();
//        int toAccountBalance = toAccount.getBalance();
//        assertEquals(3000, fromAccountBalance);
//        assertEquals(transferAmount, toAccountBalance);
//    }


    @Test
    public void createMultipleAccounts() {
        Account bank = new Account();
        bank.generateAccountNumber(1);
        assertEquals(200, bank.getPin());
    }
}

