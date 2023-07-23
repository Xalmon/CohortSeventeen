package work;

import java.util.Scanner;

public class CreditCard {
        public static boolean isValidCreditCard(String input) {
            int len = input.length();
            if (len < 13 || len > 16)
                return false;

            for (int i = 0; i < len; i++) {
                if (!Character.isDigit(input.charAt(i)))
                    return false;
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String creditCardNumber;
            boolean isValid = false;

            do {
                System.out.print("Enter a valid credit card number (13 to 16 digits): ");
                creditCardNumber = scanner.nextLine().trim();

                isValid = isValidCreditCard(creditCardNumber);

                if (!isValid) {
                    System.out.println("Invalid input. Credit card number should have 13 to 16 digits.");
                }
            } while (!isValid);

            System.out.println("Valid credit card number entered: " + creditCardNumber);

            scanner.close();
        }
    }
