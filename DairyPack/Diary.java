package DairyPack;

import java.util.ArrayList;
import java.util.List;

public class Diary {


    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }


    public boolean unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
            return true;
        }
        return false;
    }

        public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if (!isLocked) {
            Entry newEntry = new Entry(entries.size(), title, body);
            entries.add(newEntry);
        }
    }

}
