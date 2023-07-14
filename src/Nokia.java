import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of menu functions");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");

        System.out.print("Choose an option from 1 - 13: ");
        int phone = scanner.nextInt();
        System.out.println();

        if (phone == 1) {
            System.out.println("1. Search");
            System.out.println("2. Service Nos. 1");
            System.out.println("3. Add name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
            System.out.println("7. Send b’card");
            System.out.println("8. Options");
            System.out.println("   1. Type of view");
            System.out.println("   2. Memory Status");
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tag");
            System.out.print("Choose an option from 1.8 - 2.8 or 0 to return: ");
            double subOption = scanner.nextDouble();
            if (subOption == 1.8) {
                System.out.println("1. Type of view");
            } else if (subOption == 0) {
                mainMenu();
            } else {
                System.out.println("2. Memory Status");
            }
        } else if (phone == 2) {
            System.out.println("1. Write messages");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Picture messages");
            System.out.println("5. Templates");
            System.out.println("6. Smileys");
            System.out.println("7. Message settings");
            System.out.println("8. Info service");
            System.out.println("9. Voice mailbox number");
            System.out.println("10. Service command editor");
            System.out.print("Choose an option from 2.7: ");
            double subOption = scanner.nextDouble();
            if (subOption == 2.7) {
                System.out.println("1. Set 1");
                System.out.println("2. Common");
                System.out.print("Choose an option from 2.71, 2.72: ");
                double subSubOption = scanner.nextDouble();
                if (subSubOption == 2.71) {
                    System.out.println("1. Message centre number");
                    System.out.println("2. Messages sent as");
                    System.out.println("3. Message validity");
                } else if (subSubOption == 2.72) {
                    System.out.println("1. Delivery reports");
                    System.out.println("2. Reply via same centre");
                    System.out.println("3. Character support");
                }
            }
        } else if (phone == 3) {
            System.out.println("Chat");
        } else if (phone == 4) {
            System.out.println("1. Missed calls");
            System.out.println("2. Received calls");
            System.out.println("3. Dialled numbers");
            System.out.println("4. Erase recent call lists");
            System.out.println("5. Show call duration");
            System.out.println("6. Show call costs");
            System.out.println("7. Call cost settings");
            System.out.println("8. Prepaid credit");
            System.out.print("Choose an option from 4.5, 4.6, 4.7: ");
            double subOption = scanner.nextDouble();
            if (subOption == 4.5) {
                System.out.println("1. Last call duration");
                System.out.println("2. All calls’ duration");
                System.out.println("3. Received calls’ duration");
                System.out.println("4. Dialled calls’ duration");
                System.out.println("5. Clear timers");
            } else if (subOption == 4.6) {
                System.out.println("1. Last call cost");
                System.out.println("2. All calls’ cost");
                System.out.println("3. Clear counters");
            } else if (subOption == 4.7) {
                System.out.println("1. Call cost limit");
                System.out.println("2. Show costs in");
            }
        } else if (phone == 5) {
            System.out.println("1. Ringing tone");
            System.out.println("2. Ringing volume");
            System.out.println("3. Incoming call alert");
            System.out.println("4. Composer");
            System.out.println("5. Message alert tone");
            System.out.println("6. Keypad tones");
            System.out.println("7. Warning and game tones");
            System.out.println("8. Vibrating alert");
            System.out.println("9. Screen saver");
        } else if (phone == 6) {
            System.out.println("1. Call settings");
            System.out.println("2. Phone settings");
            System.out.println("3. Security settings");
            System.out.println("4. Restore factory settings");
            System.out.print("Choose an option from 6.1, 6.2, 6.3: ");
            double subOption = scanner.nextDouble();
            if (subOption == 6.1) {
                System.out.println("1. Automatic redial");
                System.out.println("2. Speed dialling");
                System.out.println("3. Call waiting options");
                System.out.println("4. Own number sending");
                System.out.println("5. Phone line in use");
                System.out.println("6. Automatic answer");
            } else if (subOption == 6.2) {
                System.out.println("1. Language");
                System.out.println("2. Cell info display");
                System.out.println("3. Welcome note");
                System.out.println("4. Network selection");
                System.out.println("5. Lights");
                System.out.println("6. Confirm SIM service actions");
            } else if (subOption == 6.3) {
                System.out.println("1. PIN code request");
                System.out.println("2. Call barring service");
                System.out.println("3. Fixed dialling");
                System.out.println("4. Closed user group");
                System.out.println("5. Phone security");
                System.out.println("6. Change access code");
            }
        } else if (phone == 7) {
            System.out.println("Call divert");
        } else if (phone == 8) {
            System.out.println("Games");
        } else if (phone == 9) {
            System.out.println("Calculator");
        } else if (phone == 10) {
            System.out.println("Reminders");
        } else if (phone == 11) {
            System.out.println("1. Alarm clock");
            System.out.println("2. Clock settings");
            System.out.println("3. Date setting");
            System.out.println("4. Stopwatch");
            System.out.println("5. Countdown timer");
            System.out.println("6. Auto update of date and time");
        } else if (phone == 12) {
            System.out.println("Profiles");
        } else if (phone == 13) {
            System.out.println("SIM services");
        } else if (phone > 13) {
            System.out.println("Enter a Valid option from 1 - 13");
            phone = scanner.nextInt();
        } else if (phone < 0) {
            System.out.println("Enter a Valid option from 1 - 13");
            phone = scanner.nextInt();
        }
    }

    public static void mainMenu() {
        System.out.println("List of menu functions");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
    }


}