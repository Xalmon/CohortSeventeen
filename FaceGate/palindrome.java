package FaceGate;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String user_input1;
        System.out.println("Enter a Palindrome (e.g. madam): ");
        user_input1 = user_input.nextLine().toLowerCase();
        boolean isPalindrome = checkPalindrome(user_input1);
        String reversed = reverseString(user_input1);
        System.out.println("Reversed string: " + reversed);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return reversed.equals(input);
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
}
