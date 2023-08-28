package tdd;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;

    private static List<Account> accounts = new ArrayList<>();

    private String firstName;
    private String lastName;
    private String pin;
    private int balance;

    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        balance = 0;
        this.accountNumber = generateAccountNumber();
        accounts.add(this);
    }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount, String pin) {
        boolean amountIsPositive = amount > 0;
        boolean sufficientFunds = balance >= amount;
        boolean correctPin = pin.equals(this.pin);

        if (amountIsPositive && sufficientFunds && correctPin) {
            balance -= amount;
        }
    }

    public void updatePin(String newPin) {
        pin = newPin;
    }

    public String getPin() {
        return pin;
    }

    public static List<Account> getAccounts() {
        return accounts;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + getPin();
    }

    public String getGetAccountNumber() {
        return accountNumber;
    }

    private static int accountCounter = 0;
    private String generateAccountNumber() {
        accountCounter++;
        return Integer.toString(accountCounter);
    }
}
