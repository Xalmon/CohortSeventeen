package FaceGate;

import java.util.Scanner;

public class palindrome {
        public static void main(String[] args) {
            Scanner user_input = new Scanner(System.in);
            String user_input1;
            System.out.println("Enter a Palindrome (eg): madam: ");
            user_input1 = user_input.nextLine().toLowerCase();
            String reversed = reverseString(user_input1);
            System.out.println("Reversed string: " + reversed);
            if(reversed.equals(user_input1)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }

        public static String reverseString(String input) {
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            return sb.toString();
            }


        }


