import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int count = input.nextInt();

            int first = 0;
            int second = 1;
            int[] sequence = new int[count];
            sequence[0] = first;

            if (count > 1) {
                sequence[1] = second;
                for (int number = 2; number < count; number++) {
                    int next = first + second;
                    sequence[number] = next;
                    first = second;
                    second = next;
                }
            }

            System.out.println("Fibonacci: " + Arrays.toString(sequence));
        }
    }