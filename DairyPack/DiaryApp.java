package DairyPack;

import javax.swing.JOptionPane;

public class DiaryApp {

    public static void main(String[] args) {
        Diary diary = new Diary("", "");
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Set a password for your diary:");
        diary.setUsername(username);
        diary.setPassword(password);

        while (true) {
            String[] options = {"Unlock Diary", "Lock Diary", "Create Entry", "Exit"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Select an action:",
                    "Diary Application",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (choice) {
                case 0:
                    String enteredPassword = JOptionPane.showInputDialog("Enter your diary password:");
                    if (diary.unlockDiary(enteredPassword)) {
                        JOptionPane.showMessageDialog(null, "Diary unlocked successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect password. Diary remains locked.");
                    }
                    break;
                case 1:
                    diary.lockDiary();
                    JOptionPane.showMessageDialog(null, "Diary locked successfully!");
                    break;
                case 2:
                    if (diary.isLocked()) {
                        JOptionPane.showMessageDialog(null, "Diary is locked. Unlock it to create entries.");
                    } else {
                        String title = JOptionPane.showInputDialog("Enter the title of the entry:");
                        String body = JOptionPane.showInputDialog("Enter the body of the entry:");
                        diary.createEntry(title, body);
                        JOptionPane.showMessageDialog(null, "Entry created successfully!");
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
