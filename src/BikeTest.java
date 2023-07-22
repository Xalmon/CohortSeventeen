import org.junit.jupiter.api.Test;
import tdd.Bike;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @Test
    public void checkThatBikeIsOnTest() {
        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.turnOn());
    }

    @Test
    public void checkThatBikeCanBeOffTest() {
        Bike bike = new Bike();
        bike.isOn();
        bike.isOff();
        assertFalse(bike.turnOn());
    }

    @Test
    public void increaseSpeedBy1Test() {
        Bike bike = new Bike();
        bike.isOn();
        bike.acceleration();

    }
}
