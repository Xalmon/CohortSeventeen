package JavaTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class question4Test {

    @Test
    public void checkThatArrayCanRemoveEvenNumbers(){
        myArray arr = new myArray();
        arr.checkEvenOdd();
    }

    @Test
    public void checkThatArrayCanSubtractFromEvenNumbers(){
        myArray arr = new myArray();
        arr.subtractFromOdd();
    }
}
