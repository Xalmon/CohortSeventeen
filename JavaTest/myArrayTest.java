package JavaTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myArrayTest {

        @Test
        public void checkThatArrayCanRemoveEvenNumbers() {
            myArray arr = new myArray(new int[]{22, 41, 15, 8, 2, 1});
            arr.collectOddNumbersAndSubtractTwo();
            int[] expectedArray = {41, 13, 1};
            assertArrayEquals(expectedArray, arr.toArray());
        }

        @Test
        public void checkThatArrayCanSubtractFromOddNumbers() {
            myArray arr = new myArray(new int[]{22, 41, 15, 8, 2, 1});
            arr.subtractFromOdd();
            int[] expectedArray = {22, 40, 14, 8, 2, 0};
            assertArrayEquals(expectedArray, arr.toArray());
        }


}



