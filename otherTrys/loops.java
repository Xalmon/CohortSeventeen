package otherTrys;

public class loops {
    public static void main(String[] args) {


        int number = 1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 10);


        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }


        String message = "Hello, World!";
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
        }

    }
}
