package FaceGate;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String user_input1;
        for (int i = 100; ; i++) {
            System.out.println("Enter a number between (1 - 10)");
            user_input1 = user_input.nextLine();
            if (user_input1.equals("1")) {
                System.out.println("one");
            } else if (user_input1.equals("2")) {
                System.out.println("two");
            } else if (user_input1.equals("3")) {
                System.out.println("three");
            } else if (user_input1.equals("4")) {
                System.out.println("four");
            } else if (user_input1.equals("5")) {
                System.out.println("five");
            } else if (user_input1.equals("6")) {
                System.out.println("six");
            } else if (user_input1.equals("7")) {
                System.out.println("seven");
            } else if (user_input1.equals("8")) {
                System.out.println("eight");
            } else if (user_input1.equals("9")) {
                System.out.println("nine");
            } else if (user_input1.equals("10")) {
                System.out.println("ten");
            } else if (user_input1.equals("-1")){
                break;
            }
            else {
                System.out.println("invalid");
            }
        }



    }
}


