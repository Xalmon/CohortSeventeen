package JavaTest;

public class question4 {
    public static void main(String[] args) {
        question4 question = new question4();
        int[] myArray = {22, 41, 15, 8, 2, 1};

        question.checkEvenOdd(myArray);
    }

    public void checkEvenOdd(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                num -= 2;
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }
}
