package tdd;

public class LoopTest1 {
    public static void main(String[] args) {
        int count = 4;
        while (count < 9) {
            int count1 = 8;
            while (count1 < 9) {
                System.out.print(4);
                System.out.println();
                System.out.print(8);
                count1++;
            }
            count++;
        }
    }
}
