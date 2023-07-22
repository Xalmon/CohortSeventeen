package tdd;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static java.util.Calendar.DECEMBER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRateTest {



    @Test
    public void testThatHeartRatesExists() {
        HeartRates heartrates = new HeartRates();
        assertNotNull(heartrates);
    }
     @Test
     public void testThatHeartRatesFirstName() {
         HeartRates heartrates = new HeartRates();
         assertNotNull(heartrates.getFirstName());
     }

    @Test
    public void testThatHeartRatesLastName() {
        HeartRates heartrates = new HeartRates();
        assertNotNull(heartrates.getLastName());
    }

}