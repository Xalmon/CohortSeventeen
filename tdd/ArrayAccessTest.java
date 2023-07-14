package tdd;

public class ArrayAccessTest {
    public class ArrayUtils {
        public static int getSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        public static int getLargest(int[] array) {
            int largest = array[0];
            for (int num : array) {
                if (num > largest) {
                    largest = num;
                }
            }
            return largest;
        }

        public static int getSmallest(int[] array) {
            int smallest = array[0];
            for (int num : array) {
                if (num < smallest) {
                    smallest = num;
                }
            }
            return smallest;
        }
    }
}
