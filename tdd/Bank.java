package tdd;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> ArrayList;
    private List<Account> accounts = new ArrayList<>();
    private int balance;

    private String pin;





    public void register(String firstName, String lastName, String pin) {
        Account account = new Account(firstName, lastName, pin);
        accounts.add(account);
    }

    public String generateAccountNumber() {
        return accounts.size() + 1 + " ";
    }

    public String getFullName(String accountNumber) {
        Account account = findAccount(accountNumber);
        return account.getFullName();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getGetAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new IllegalStateException("Account couldn't be found");
    }

    public int getBalance() {
        return balance;
    }



    public void deposit(int amount, String accountNumber) {
        if (amount > 0) {
            findAccount(accountNumber).deposit((balance += amount));
        }
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        if (balance > amount) {
            findAccount(accountNumber).withdraw((balance -= amount), pin);
        }
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, int transferAmount, String fromPin, String toPin) {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        boolean amountIsPositive = transferAmount > 0;
        boolean amountInBank = fromAccount.getBalance() >= transferAmount;
        boolean correctFromPin = fromPin.equals(fromAccount.getPin());
        boolean correctToPin = toPin.equals(toAccount.getPin());

        if (amountIsPositive && amountInBank && correctFromPin && correctToPin) {
            fromAccount.withdraw(transferAmount, fromPin);
            toAccount.deposit(transferAmount);
        }
    }

}



