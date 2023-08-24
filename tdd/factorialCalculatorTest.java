package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class factorialCalculatorTest {

    @Test
    public void calculateFactorialTest() {
        factorialCalculator factorialCalculator = new factorialCalculator();
        int factorial = factorialCalculator.calculateFactorial(5);
        assertEquals(120, factorial);
    }
}
