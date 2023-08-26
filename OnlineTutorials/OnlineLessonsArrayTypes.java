package OnlineTutorials;

import java.util.Arrays;

public class OnlineLessonsArrayTypes {
    public static void main(String[] args) {

        int[] singleArray = new int[5];
        singleArray[0] = 10;

        int[][] twoDArray = new int[3][4];
        twoDArray[0][0] = 1;

        int[][][] threeDArray = new int[2][3][4];
        threeDArray[0][0][0] = 1;

        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[4];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];

        String[] stringArray = new String[3];
        stringArray[0] = "Hello";

        OnlineLessonsArrayTypes arrayTypes = new OnlineLessonsArrayTypes();
        arrayTypes.printNumbers(1, 2, 3);

        int[] array = {3, 1, 4, 1, 5};
        Arrays.sort(array);
    }

    public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
