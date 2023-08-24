package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void canDepositIntoAccountTest() {
        Account BabaAccount = new Account();
        int currentBalance = BabaAccount.getBalance();
        assertEquals(0, currentBalance);
        BabaAccount.deposit(5000);
        currentBalance = BabaAccount.getBalance();
        assertEquals(5000, currentBalance);

    }

    @Test
    public void canDepositTwiceAccount() {
        Account BabaAccount = new Account();
        BabaAccount.deposit(8000);
        int currentBalance = BabaAccount.getBalance();
        assertEquals(8000, currentBalance);
        BabaAccount.deposit(2000);
        int newBalance = BabaAccount.getBalance();
        assertEquals(10000, newBalance);
    }


    @Test
    public void cannotDepositNegativeAmount(){
        Account BabaAccount = new Account();
        BabaAccount.deposit(1000);
        int currentBalance = BabaAccount.getBalance();
        assertEquals(1000, currentBalance);
        BabaAccount.deposit(-2000);
        int newBalance = BabaAccount.getBalance();
        assertEquals( 1000, newBalance);
    }
    @Test
    public void canWithdraw(){
        Account BabaAccount = new Account();
        BabaAccount.deposit(5000);
        int currentBalance = BabaAccount.getBalance();
        assertEquals(5000, currentBalance);
        BabaAccount.withdraw( 2000);
        //check
        int newBalance = BabaAccount.getBalance();
        assertEquals( 3000, newBalance);
    }

}


