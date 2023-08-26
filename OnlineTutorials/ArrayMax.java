package OnlineTutorials;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = getArrayFromUser();

        int maxVal = findMax(arr);
        System.out.println("Maximum value: " + maxVal);
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

    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
