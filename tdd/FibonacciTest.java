package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciCreation() {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    @Test
    public void testMultiplyWithFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
    }
}
