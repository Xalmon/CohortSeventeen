package JavaTest;

public class question3 {
    public static void main(String[] args) {
        int[] myArray = {45, 52, 33, 11, 48, 25};

        for (int number = 0; number < myArray.length / 2; number += 2) {
            int temp = myArray[number];
            myArray[number] = myArray[myArray.length - 1 - number];
            myArray[myArray.length - 1 - number] = temp;
        }

        for (int num : myArray) {
            System.out.print(" " + num);
        }
    }
}
