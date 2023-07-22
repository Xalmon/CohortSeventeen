package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ClocksTest {

    @Test
    public void ifTestTimeTaken() {
        Clocks watch = new Clocks();
        assertNotNull(watch);
    }


    @Test
    public void convertMinuteToSeconds(){
        Clocks watch = new Clocks();
        watch.setMinutes(-100000);

        watch.convertMinutesToSeconds();

        int check = watch.getSeconds();
        assertEquals(0, check);
    }

    @Test
    public void convertHoursToMinutes(){
        Clocks watch = new Clocks();
        watch.setHours(-1);

        watch.convertHoursToMinutes();

        int check = watch.getMinutes();
        assertEquals(0, check);
    }

    @Test
    public void convertYearToMinutes(){
        Clocks watch = new Clocks();
        watch.setYear(-2);

        watch.convertYearToMinutes();

        int check = watch.getYear();
        assertEquals(0, check);
    }

    @Test
    public void convertMinutesToYears(){
        Clocks watch = new Clocks();
        watch.setMinutes(-1000000);

        watch.convertMinutesToYear();

        int check = watch.getMinutes();
        assertEquals(0, check);
    }
}