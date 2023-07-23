package others;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr2D = new int[2][];
        arr2D[0] = new int[3];
        arr2D[1] = new int[4];
        int counter = 0;

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = counter++;
            }
        }

        for (int row = 0; row < arr2D.length; row++) {
            System.out.println();
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
        }
    }
}
