import java.util.Scanner;

public class Checks {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        System.out.print("Enter the fourth number: ");
        num4 = input.nextInt();

        System.out.print("Enter the fifth number: ");
        num5 = input.nextInt();

        System.out.println("Enter an integer: ");
        num6 = input.nextInt();

        int divisible;
        divisible = num6 % 3;

        int largest = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int smallest = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println(divisible);
    }

}

