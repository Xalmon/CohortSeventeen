package otherTrys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EnhancedLoops {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        String[] fruits = { "Apple", "Banana", "Orange" };

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Orange");

        Iterator<String> iterator = fruits2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
