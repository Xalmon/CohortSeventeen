package work;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
        };


        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print("Enter value for index [" + row + "][" + column + "]: ");
                array[row][column] = input.nextInt();
            }
        }


        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
