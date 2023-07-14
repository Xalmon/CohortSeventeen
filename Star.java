public class Star {
    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter++) {
            for (int counter1 = 0; counter1 < counter + 1; counter1++) {
                System.out.print('@' + " ");
            }
            for (int counter1 = 0; counter1 < 10 - counter; counter1++) {
                System.out.print(" " + " ");
            }
            for (int counter1 = 0; counter1 < 10 - counter; counter1++) {
                System.out.print('@' + " ");
            }
            for (int counter1 = 0; counter1 < counter + 1; counter1++) {
                System.out.print(" " + " ");
            }
            for (int counter1 = 0; counter1 < counter + 1; counter1++) {
                System.out.print(" " + " ");
            }
            for (int counter1 = 0; counter1 < 10 - counter; counter1++) {
                System.out.print('@' + " ");
            }
            for (int counter1 = 0; counter1 < 10 - counter; counter1++) {
                System.out.print(" " + " ");
            }
            for (int counter1 = 0; counter1 < counter + 1; counter1++) {
                System.out.print('@' + " ");
            }
            System.out.println();
        }
    }
}
