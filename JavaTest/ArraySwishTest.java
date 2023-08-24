package JavaTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArraySwishTest {

    @Test
    public void doesArraySwishExist() {
        myArray arr = new myArray();
        assertNotNull(arr);
    }

    @Test
    public void isThereAnythingInArraySwish() {
        myArray arr = new myArray();
        assertTrue(arr.isEmpty());
    }
}


