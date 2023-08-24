import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int balance;

    public Bank() {
        accounts = new ArrayList<>();
        balance = 0;
    }

    public void register(String firstName, String lastName, String pin) {
        Account account = new Account(firstName, lastName, pin);
        accounts.add(account);
    }
    public int getBalance() {
        return balance;
    }



    public void deposit(int amount) {
        boolean amountIsPositive = amount > 0;
        if (amountIsPositive) {
            balance += amount;
        }
    }
}
