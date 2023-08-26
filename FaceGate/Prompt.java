package FaceGate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Prompt {
    public static String validateName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid name: ");
        return scanner.nextLine();
    }

    public static boolean checkIfSpecialCharacterStartname(String name) {
        String regex = "^[^@!@#$%^&**()_+=-]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }


    public static boolean checkValidname(String name) {
        if (!checkIfSpecialCharacterStartname(name)) {
            System.out.println("Incorrect name: Should start with a valid character.");
            return false;
        }
        if (!isnamelValid(name)) {
            System.out.println("Incorrect name: Not a valid format.");
            return false;
        }
        return true;
    }

    private static boolean isnamelValid(String name) {
            String regex = "^[a-zA-Z]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        }


    public static void userEntry() {
        String name = validateName();
        if (checkValidname(name)) {
            System.out.println("valid name! Congrats!");
        } else {
            userEntry();
        }
    }

    public static void main(String[] args) {
        userEntry();
    }
}

