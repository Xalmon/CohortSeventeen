package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
    @Test
    public void ifAirConditionIsOnTest() {
        AirCondition AC = new AirCondition();
        boolean status = AC.getIsOn();
        assertFalse(status);

        AC.setIsOn(true);
        boolean newStatus = AC.getIsOn();
        assertTrue(newStatus);
    }

    @Test
    public void ifAirConditionCanBeOff() {
        AirCondition AC = new AirCondition();
        AC.setIsOn(true);
        boolean status = AC.getIsOn();
        assertTrue(status);

        AC.setIsOn(false);

        boolean newStatus = AC.getIsOn();
        assertFalse(newStatus);
    }


    @Test
    public void canTemperatureDecreaseTest() {
        AirCondition AC = new AirCondition();
        AC.setIsOn(true);
        boolean status = AC.getIsOn();
        assertTrue(status);
        AC.setTemperature(17);
        int acTemperature = AC.getTemperature();
        assertEquals(17, acTemperature);

        AC.decreaseTemperature();
        int newAcTemperature = AC.getTemperature();
        assertEquals(16, newAcTemperature);
    }

    @Test
    public void canTemperatureIncreaseBeyondTest() {
        AirCondition AC = new AirCondition();
        AC.setIsOn(true);
        boolean status = AC.getIsOn();
        assertTrue(status);
        AC.setTemperature(30);
        int acTemperature = AC.getTemperature();
        assertEquals(30, acTemperature);

        AC.increaseTemperature();
        int newAcTemperature = AC.getTemperature();
        assertEquals(30, newAcTemperature);
    }

    @Test
    public void canTemperatureDecreaseBelowTest() {
        AirCondition AC = new AirCondition();
        AC.setIsOn(true);
        boolean status = AC.getIsOn();
        assertTrue(status);
        AC.setTemperature(16);
        int acTemperature = AC.getTemperature();
        assertEquals(16, acTemperature);

        AC.decreaseTemperature();
        int newAcTemperature = AC.getTemperature();
        assertEquals(16, newAcTemperature);
    }
}