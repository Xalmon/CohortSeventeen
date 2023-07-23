//package work;
//
//import java.util.Scanner;
//
//public class StringMethod {
//    public static void main(String[] args) {
//        Scanner collect = new Scanner(System.in);
//
//        String[] chkmtd = new String[]{
//                "$,#,_,-,:,;,="
//        };
//        int[] userResponses = new int[chkmtd.length];
//
//        System.out.print("What's your name: ");
//        String userName = collect.nextLine();
//
//        for (int response = 0; response < chkmtd.length; response++) {
//            userResponses[response] = (chkmtd[response], collect);
//        }
//
//        System.out.print("\n" + "string is : ");
//        String string = checkString(userResponses);
//        System.out.println(userResponses);
//
//
//        collect.close();
//
//    }
//
//    public static String chkmtd(String chkmtd, Scanner scan) {
//        System.out.println(chkmtd);
//        return chkmtd;
//    }
//    private static String checkString(int[] userResponses) {
//        String checkString = "";
//        return checkString;
//    }
//}