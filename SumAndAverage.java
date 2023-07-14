import java.util.Scanner;

public class SumAndAverage {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int totalScores = 10;
                int sum = 0;

                System.out.println("Enter ten scores:");
                for (int scoreNumber = 1; scoreNumber <= totalScores; scoreNumber++) {
                        System.out.print("Score " + scoreNumber + ": ");
                        int score = input.nextInt();
                        sum += score;
                }

                double average = (double) sum / totalScores;

                System.out.println("The sum of the scores is: " + sum);
                System.out.println("The average is: " + average);
        }
}
