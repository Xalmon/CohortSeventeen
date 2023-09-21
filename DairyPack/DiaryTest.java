package DairyPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Test
   public void newDairy() {
        Diary diary = new Diary("solomon", "0000");


    }

    @Test
    void testThatYouCanUnlockDiary() {
        Diary diary = new Diary("solomon", "0000");
        diary.unlockDiary("0000");
        assertFalse(diary.isLocked());
    }

    @Test
    void testThatYouCanLockDiary() {
        Diary diary = new Diary("solomon", "0000");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    void testThatYouCanCreateEntry() {
        Diary diary = new Diary("solomon", "0000");
        diary.unlockDiary("0000");
        diary.createEntry("Entry Title", "Entry Body");
        assertEquals(1, diary.getEntries().size());
    }


}
