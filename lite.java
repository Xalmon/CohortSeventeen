import java.util.Scanner;

public class lite {
    public static void main(String[] args) {
        Scanner lord = new Scanner(System.in);

        double count = 0;
        double sum = 0;


        while (count < 10){
            System.out.print("Enter a number: ");
            double number = lord.nextInt();

            sum = count + number;
            count++;
        }
        System.out.println(sum);
    }
}

