package otherTrys;

public class moreloops {
    public static void main(String[] args) {
        for (int i = 11; ; i++) {
            if (i % 2 == 0) {
                System.out.println("First even number greater than 10: " + i);
                break;
            }
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
