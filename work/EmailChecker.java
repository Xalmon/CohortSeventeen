package work;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailChecker {

        public static String validateEmail() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a valid Email: ");
            return scanner.nextLine();
        }

        public static boolean isEmailValid(String email) {
            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        public static boolean checkIfSpecialCharacterStartEmail(String email) {
            String regex = "^[^@]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.find();
        }

        public static boolean checkIfSpecialCharacterEndEmail(String email) {
            String regex = "[^@]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.find();
        }

        public static boolean checkValidEmail(String email) {
            if (!checkIfSpecialCharacterStartEmail(email)) {
                System.out.println("Incorrect email: Should start with a valid character.");
                return false;
            }
            if (!checkIfSpecialCharacterEndEmail(email)) {
                System.out.println("Incorrect email: Should end with a valid character.");
                return false;
            }
            if (!isEmailValid(email)) {
                System.out.println("Incorrect email: Not a valid email format.");
                return false;
            }
            return true;
        }

        public static void userEntry() {
            String email = validateEmail();
            if (checkValidEmail(email)) {
                System.out.println("Wow, you've got a valid email! Congrats!");
            } else {
                userEntry();
            }
        }

        public static void main(String[] args) {
            userEntry();
        }
    }

