package tdd;


import static tdd.ArrayAccessTest.*;
import static tdd.ArrayAccessTest.ArrayUtils.*;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};

        int sum = getSum(numbers);
        System.out.println("Sum: " + sum);

        int largest = getLargest(numbers);
        System.out.println("Largest element: " + largest);

        int smallest = getSmallest(numbers);
        System.out.println("Smallest element: " + smallest);
    }
}