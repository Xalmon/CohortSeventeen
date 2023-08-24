import java.util.ArrayList;
import java.util.List;

public class Account {

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
        accounts.add(this);
    }

    public Account() {
        accounts.add(this);
        balance = 0;
        pin = "0000";
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

    public void transfer(int transferAmount, String senderPin, String recipientPin) {
        boolean amountIsPositive = transferAmount > 0;
        boolean sufficientFundsInAccount = balance >= transferAmount;
        boolean correctSenderPin = senderPin.equals(this.pin);
        boolean correctRecipientPin = recipientPin.equals(this.pin);

        if (amountIsPositive && sufficientFundsInAccount && correctSenderPin && correctRecipientPin) {
            balance -= transferAmount;
        }
    }

    public static void generateAccountNumber(int accountCount) {
        for (int number = 0; number < accountCount; number++) {
            Account generateAccountNumber = new Account();
        }
    }
}
