package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testThatCalculatorExists() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void testThatCalculatorCanBePoweredOn() {
        Calculator calculator = new Calculator();
        calculator.power();
        assertTrue(calculator.isOn());
    }

    @Test
    public void testThatCalculatorCanBePoweredOff() {
        Calculator calculator = new Calculator();
        calculator.power();
        assertTrue(calculator.isOn());
        assertTrue(Calculator.isOff());
    }

    @Test
    public void testThatCalculatorCanAdd() {
        Calculator calculator = new Calculator();
        Calculator.power();
        assertTrue(calculator.isOn());
        calculator.add(17, 17);
        assertEquals(34,calculator.result);
    }

    @Test
    public void testThatCalculatorCanSubtract() {
        Calculator calculator = new Calculator();
        Calculator.power();
        assertTrue(calculator.isOn());
        calculator.subtract(12, 2);
        assertEquals(10,calculator.result);

    }
}