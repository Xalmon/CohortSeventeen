public class IntArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;

        while (count < 10) {
            numbers[count] = 0;
            count++;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}