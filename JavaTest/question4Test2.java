package JavaTest;

import JavaTest.myArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class question4Test2 {
    @Test
    public void checkThatEvenNumbersCanBeRemovedAndOddNumbersCanBeSubtracted(){
        myArray arr = new myArray(new int[]{22, 41, 15, 8, 2, 1});
        arr.collectOddNumbersAndSubtractTwo();
        int[] expected = {39, 13, -1};
        assertArrayEquals(expected, arr.toArray());
    }
}
