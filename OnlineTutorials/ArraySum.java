package OnlineTutorials;

import java.util.Scanner;

public class ArraySum {
        public static void main(String[] args) {
            int[] arr = getArrayFromUser();

            int missingNumber = findMissingNumber(arr);
            System.out.println("Missing number: " + missingNumber);

            reverseArray(arr);
            System.out.println("Array after reversing:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            int secondLargest = findSecondLargest(arr);
            System.out.println("\nSecond Largest number: " + secondLargest);
        }

        public static void reverseArray(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty or invalid.");
                return;
            }

            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        public static int findSecondLargest(int[] arr) {
            if (arr == null || arr.length < 2) {
                System.out.println("Array is empty or does not have enough elements.");
                return Integer.MIN_VALUE;
            }

            int largest = Math.max(arr[0], arr[1]);
            int secondLargest = Math.min(arr[0], arr[1]);

            for (int i = 2; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] < largest) {
                    secondLargest = arr[i];
                }
            }
            return secondLargest;
        }

        public static int findMissingNumber(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Array is empty or invalid.");
                return -1;
            }

            int n = arr.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }
            return expectedSum - actualSum;
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

