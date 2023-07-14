import java.util.Scanner;

public class EnforcingPrivacy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        int [] number = new int[4];
        int count = 0;
        int secondEncrypt = 0;

        while (count < 4) {
            System.out.print("Enter a four digit password: ");
            int number = scan.nextInt();

            if (number > 0) {
                int firstEncrypt = number + 7;
                secondEncrypt = firstEncrypt % 10;
            } else {
                return;
            }



            System.out.println(secondEncrypt);

            count++;
        }
    }
}