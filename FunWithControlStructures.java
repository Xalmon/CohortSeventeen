import java.util.Arrays;

public class FunWithControlStructures{

    public static void main(String[] args){

        int i;
        for (i = 0; i < 10; i++)
        {
            if (i == 4)
            {
                break;
            }
            System.out.println("Value of i in loop: "+ i);
        }
        System.out.println("\n");

        for (i = 0; i < 10; i++)
        {
            if (i == 4)
            {
                continue;
            }
            System.out.println("Value of i in loop: "+ i);
        }
        System.out.println("\n");
        int [] intArray = new int[10];
        do {
            intArray[i++] = i;
        } while (i<10);
        System.out.println(Arrays.toString(intArray));
    }
}
