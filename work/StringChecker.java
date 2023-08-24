package work;

import java.util.Scanner;

public class StringChecker {

        public static void main(String[] args) {
            Scanner collect = new Scanner(System.in);

            String[] questions = new String[]{
                    "Does your name contain '$'?",
                    "Does your name contain '#'?",
                    "Does your name contain '_'?",
                    "Does your name contain '-'?",
                    "Does your name contain ':'?",
                    "Does your name contain ';'?",
                    "Does your name contain '='?"
            };

            String[] userResponses = new String[questions.length];

            System.out.print("What's your name: ");
            String userName = collect.nextLine();

            for (int response = 0; response < questions.length; response++) {
                System.out.print(questions[response] + " ");
                userResponses[response] = collect.nextLine().toLowerCase();
            }

            System.out.println("\nYour name is: " + userName);
            System.out.println("Your responses: ");
            for (int response2 = 0; response2 < questions.length; response2++) {
                System.out.println(questions[response2] + " " + checkString(userResponses[response2]));
            }

            collect.close();
        }

        private static String checkString(String response) {
            String checkString = "No";
            if (response.equals("yes") || response.equals("y")) {
                checkString = "Yes";
            }
            return checkString;
        }
    }