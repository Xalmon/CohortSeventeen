package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Mp3Test{

    @Test
    public void checkThatMp3IsOff(){
        Mp3 sony = new Mp3();
        sony.setIsOn(true);
        boolean status = sony.getIsOn();
        assertTrue(status);

        sony.setIsOff(true);

        boolean newStatus = sony.getIsOff();
        assertTrue(newStatus);
    }

    @Test
    public void checkVolume(){
        Mp3 sony = new Mp3();
        sony.setIsOn(true);
        boolean status = sony.setIsOn();
        assertTrue(status);
        sony.setVolume(40);
        int volumeIncrease = sony.getVolume();
        assertEquals(40, volumeIncrease);

        sony.setvolume(40);

        sony.increaseVolume();
        int newMp3Volume = sony.getVolume();
        assertEquals(41, newMp3Volume);
    }

    @Test
    public void checkVolumeDecrease(){
        Mp3 sony = new Mp3();
        sony.setIsOn(true);
        boolean status = sony.setIsOn();
        assertTrue(status);

        sony.setvolume(35);

        sony.decreaseVolume();
        int newMp3Volume = sony.getVolume();
        assertEquals(34, newMp3Volume);
    }

    @Test
    public void checkThatMp3CanPlay(){
        Mp3 sony = new Mp3();
        sony.setIsOn(true);
        boolean status = sony.setIsOn();
        assertTrue(status);

        sony.play();

    }
}

