public class Index {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 8, 9, 10, 11};
        for (int num1 = 0; num1 < num.length; num1++) {
            int sum = 0;
            for (int num2 = 0; num2 < num.length; num2++) {
                if (num1 != num2) {
                    sum += num[num2];
                }
            }

            System.out.println("smallest: " + num1);
            System.out.println("largest: " + sum);
        }
    }
}