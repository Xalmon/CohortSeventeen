package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {
    @Test
    public void registerTest() {
        Bank bank = new Bank();
        bank.register("Baba", "Solo", "1234");
        Account account = bank.getAccounts().get(0);
        assertEquals("Baba Solo 1234", account.getFullName());
    }


    @Test
    public void depositTest() {
        Bank bank = new Bank();
        bank.register("Baba", "Solo", "1234");
        bank.deposit(1000, bank.getAccounts().get(0).getGetAccountNumber());
        int currentBalance = bank.getAccounts().get(0).getBalance();
        assertEquals(1000, currentBalance);
    }

    @Test
    public void withdrawTest() {
        Bank bank = new Bank();
        bank.register("Baba", "Solo", "1234");
        bank.deposit(5000, bank.getAccounts().get(0).getGetAccountNumber());
        int currentBalance = bank.getBalance();
        assertEquals(5000, currentBalance);
        bank.withdraw(2000, "1", "0000");
        int newBalance = bank.getBalance();
        assertEquals(3000, newBalance);
    }

    @Test
    public void bankTransferTest() {
        Bank bank = new Bank();
        bank.register("Baba", "Solo", "1234");
        bank.register("messi", "wa", "1431");
        String fromAccount = bank.getAccounts().get(0).getGetAccountNumber();
        String toAccount = bank.getAccounts().get(1).getGetAccountNumber();
        bank.deposit(5000, fromAccount);
        bank.transfer(fromAccount, toAccount, 2000, "1234", "1431");
        int fromAccountCheckBalance = bank.findAccount(fromAccount).getBalance();
        int toAccountCheckBalance = bank.findAccount(toAccount).getBalance();
        assertEquals(3000, fromAccountCheckBalance);
        assertEquals(2000, toAccountCheckBalance);
    }


    @Test
    public void createMultipleAccountsTest() {
        Bank bank = new Bank();
        bank.register("Baba", "Solo", "1234");
        bank.register("messi", "wa", "1431");
        assertEquals("3", bank.generateAccountNumber());
    }
}

