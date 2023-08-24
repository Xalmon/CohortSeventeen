package JavaTest;

public class ArraySwish {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};

        for (int number = 0; number < myArray.length - 1; number += 2) {
            int temp = myArray[number];
            myArray[number] = myArray[number + 1];
            myArray[number + 1] = temp;
        }

        for (int num : myArray) {
            System.out.print(" " + num);
        }
    }
}
