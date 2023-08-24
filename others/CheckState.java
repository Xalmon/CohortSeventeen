package others;

import java.util.Scanner;

import static others.Geopoliticalzone.*;

public class CheckState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Geopoliticalzone chosenZone = null;
        while (chosenZone == null) {
            System.out.println("Enter a State: ");
            String userName = input.nextLine();

            chosenZone = getChosenZone(userName);
            if (chosenZone != null) {
                System.out.println("Selected Geopolitical Zone: " + chosenZone);
                System.out.println("States in " + chosenZone + ":");
                String[] statesInZone = chosenZone.getState().split(", ");
                for (String state : statesInZone) {
                    System.out.println(state);
                }
            } else {
                System.out.println("State not found or invalid input. Please try again.");
            }
        }
    }

    public static Geopoliticalzone getChosenZone(String selectedState) {
        for (Geopoliticalzone zone : Geopoliticalzone.values()) {
            String[] statesInZone = zone.getState().split(", ");
            for (String state : statesInZone) {
                if (selectedState.equalsIgnoreCase(state)) {
                    return zone;
                }
            }
        }
        return null;
    }
}
