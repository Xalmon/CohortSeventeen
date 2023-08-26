package OnlineTutorials;

import static OnlineTutorials.ArraySum.reverseArray;

public class ClassWorkArray {
    public static void main(String args[]) {
        int arrays[] = {5, 18, 32, 3, 4};

        reverseArray(arrays);
        System.out.println("Array after reversing:");
        for (int num : arrays) {
            System.out.print(num + arrays.length);
        }
    }
}
