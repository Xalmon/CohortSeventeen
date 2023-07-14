package tdd;

public class Account {
    private int balance;
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        boolean amountIsPositive = amount > 0;
        if (amountIsPositive) {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}