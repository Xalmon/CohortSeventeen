import java.util.Scanner;

public class ValidAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        double average = 0;

        while (count < 10) {
            System.out.print("Enter a number from 0 - 100: ");
            double number = scan.nextInt();

            if (number < 0 || number > 100) {
                System.out.println("Invalid input. Number must be between 0 and 100.");
            } else {
                sum += number;
                count++;
            }
        }

        average = sum / count;
        System.out.println("The average is: " + average);
    }
}