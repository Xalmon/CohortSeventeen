package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {


    @Test
    public void testThatCarCanBeCreated(){
        Car car = new Car();

        assertNull(car);
    }
   @Test
    public void testThatCarCanTurnOn(){
        Car car = new Car();
        car.start();
        assertTrue(car.isCarOn());
    }

    @Test
    public void testThatCarCanAccelerate(){
        Car car = new Car();

        assertTrue(car.isCarOn());


    }



}
