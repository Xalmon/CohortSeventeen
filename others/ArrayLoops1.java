package others;

public class ArrayLoops1 {
    public static void main(String[] args) {
        int[] myArray = {12, 45, 67, 23, 9, 41};
        int[] stats = arrayStats(myArray);

        System.out.println("Maximum value: " + stats[0]);
        System.out.println("Minimum value: " + stats[1]);
        System.out.println("Average value: " + stats[2]);
        System.out.println("Sum: " + stats[3]);
    }

    public static int[] arrayStats(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int maxVal = arr[0];
        int minVal = arr[0];
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
            if (num > maxVal) {
                maxVal = num;
            }
            if (num < minVal) {
                minVal = num;
            }
        }

        int average = totalSum / arr.length;
        return new int[]{maxVal, minVal, average, totalSum};
    }
}
