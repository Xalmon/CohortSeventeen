package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {

        @Test
        public void ifTelevisionIsOnTest() {
            Television sony = new Television();
            boolean status = sony.getIsOff();
            assertTrue(status);

            sony.setIsOn(true);

            boolean newStatus = sony.getIsOn();
            assertTrue(newStatus);
        }

        @Test
        public void ifAirTelevisionCanBeOff() {
            Television sony = new Television();
            sony.setIsOn(true);
            boolean status = sony.getIsOn();
            assertTrue(status);

            sony.setIsOff(true);

            boolean newStatus = sony.getIsOff();
            assertTrue(newStatus);
        }

        @Test
        public void VolumeTest() {
            Television sony = new Television();
            sony.setIsOn(true);
            boolean status = sony.setIsOn();
            assertTrue(status);
            sony.setVolume(40);
            int volumeIncrease = sony.getVolume();
            assertEquals(40, volumeIncrease);

            sony.setvolume(40);

            sony.increaseVolume();
            int newTelevisionVolume = sony.getVolume();
            assertEquals(41, newTelevisionVolume);

        }

        @Test
        public void VolumeTestDecrease() {
            Television sony = new Television();
            sony.setIsOn(true);
            boolean status = sony.setIsOn();
            assertTrue(status);
            sony.setVolume(35);
            int volumeDecrease = sony.getVolume();
            assertEquals(35, volumeDecrease);

            sony.setvolume(35);

            sony.decreaseVolume();
            int newTelevisionVolume = sony.getVolume();
            assertEquals(34, newTelevisionVolume);

        }

        @Test
        public void canVolumeIncreaseBeyondTest() {
            Television sony = new Television();
            sony.setIsOn(true);
            boolean status = sony.getIsOn();
            assertTrue(status);
            sony.setVolume(100);
            int tvVolume = sony.getVolume();
            assertEquals(100, tvVolume);

            sony.increaseVolume();
            int newTvVolume = 100;
            assertEquals(100, newTvVolume);
        }

        @Test
        public void canVolumeDecreaseBeyondTest() {
            Television sony = new Television();
            sony.setIsOn(true);
            boolean status = sony.getIsOn();
            assertTrue(status);
            sony.setVolume(0);
            int tvVolume = sony.getVolume();
            assertEquals(0, tvVolume);

            sony.decreaseVolume();
            int newTvVolume = sony.getVolume();
            newTvVolume = 0;
            assertEquals(0, newTvVolume);
        }

        @Test
        public void changeChannelTest() {
            Television sony = new Television();
            sony.setIsOn(true);
            boolean status = sony.setIsOn();
            assertTrue(status);
            sony.setChannel(5);
            int channelIncrease = sony.getChannel();
            assertEquals(5, channelIncrease);

            sony.nextChannel();
            int newTelevisionChannel = sony.getChannel();
            assertEquals(6, newTelevisionChannel);

        }
    }