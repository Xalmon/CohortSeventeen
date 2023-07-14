import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScores = 10;
        int sum = 0;
        int evenCount = 0;
        double average;

        System.out.println("Enter ten scores:");
        for (int scoreNumber = 1; scoreNumber <= totalScores; scoreNumber++) {
            System.out.print("Score " + scoreNumber + ": ");
            int score = scanner.nextInt();

            if (score % 2 == 0) {
                sum += score;
                evenCount++;
            }
        }

        average = (double) sum / evenCount;

        System.out.println("The sum of the even scores is: " + sum);
        System.out.println("The average of the even scores is: " + average);
    }
}
