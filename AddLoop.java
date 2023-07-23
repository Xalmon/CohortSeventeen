import java.util.Scanner;

public class AddLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores = 10;
        int sum = 0;

        System.out.println("Enter ten scores:");
        for (int score1 = 1; score1 <= scores; score1++) {
            System.out.print("Score " + score1 + ": ");
            int score = scanner.nextInt();
            sum += score;
        }

        System.out.println("Sum: " + sum);
        int max = findMax(scores);
        System.out.println("Max: " + max);
    }

    public static int findMax(int numOfScores) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int temp;

        for (int i = 0; i < numOfScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            temp = scanner.nextInt();
            max = Math.max(max, temp);
        }
        return max;
    }
}
