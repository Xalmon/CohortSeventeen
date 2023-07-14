import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores = 10;
        int totalScores = 10;
        double sum = 0;

        System.out.println("Enter ten scores:");
        double average = 0;

        for (int score1 = 1; score1 <= scores; score1++) {
            System.out.print("Score" + score1 + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        average = sum / totalScores;
        System.out.println("The average is: " + average);
    }
}