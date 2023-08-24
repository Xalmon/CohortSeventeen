package work;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);

        String[] chkmtd = new String[]{
                "$", "#", "_", "-", ":", ";", "="
        };
        int[] userResponses = new int[chkmtd.length];

        System.out.print("What's your name: ");
        String userName = collect.nextLine();

        for (int response = 0; response < chkmtd.length; response++) {
            userResponses[response] = chkmtd(chkmtd[response], collect);
        }

        System.out.print("\n" + "string is: ");
        String string = checkString(userResponses);
        System.out.println(string);

        collect.close();
    }

    public static int chkmtd(String chkmtd, Scanner scan) {
        System.out.print("Enter the count for '" + chkmtd + "': ");
        int count = scan.nextInt();
        return count;
    }

    private static String checkString(int[] userResponses) {
        StringBuilder checkString = new StringBuilder();
        for (int response : userResponses) {
            checkString.append(response).append(" ");
        }
        return checkString.toString();
    }
}
