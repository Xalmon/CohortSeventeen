package OnlineTutorials;

import java.util.Scanner;

public class ArrayLoopsWithMethods {
    public static void main(String[] args) {
        int[] myArray = {12, 45, 67, 23, 9, 41};

        int maxVal = findMax(myArray);
        int minVal = findMin(myArray);
        double average = findAverage(myArray);
        int totalSum = findSum(myArray);

        System.out.println("Maximum value: " + maxVal);
        System.out.println("Minimum value: " + minVal);
        System.out.println("Average value: " + average);
        System.out.println("Sum: " + totalSum);
    }

    public static int[] getArrayFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int counter = 0; counter < n; counter++) {
            arr[counter] = input.nextInt();
        }

        return arr;
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid.");
            return Integer.MIN_VALUE;
        }

        int maxVal = arr[0];

        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        return maxVal;
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid.");
            return Integer.MIN_VALUE;
        }

        int minVal = arr[0];

        for (int num : arr) {
            if (num < minVal) {
                minVal = num;
            }
        }

        return minVal;
    }

    public static double findAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid.");
            return 0.0;
        }

        int totalSum = findSum(arr);
        return (double) totalSum / arr.length;
    }

    public static int findSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid.");
            return 0;
        }

        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        return totalSum;
    }

    public static void checkEvenOdd(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid.");
            return;
        }

        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}


