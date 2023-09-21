package Menstral_package;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MenstrualCycleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");

        while (true) {
            try {
                System.out.print("Enter the date your last period started (MM-DD): ");
                String cycleStartStr = scanner.next();
                Date cycleStartDate = dateFormat.parse(cycleStartStr);

                System.out.print("How many days does your period usually last? ");
                int cycleLength = scanner.nextInt();

                Date periodStart = cycleStartDate;
                Date ovulationDate = new Date(cycleStartDate.getTime() + (cycleLength / 2) * 24 * 60 * 60 * 1000);
                Date safeStart = new Date(cycleStartDate.getTime() + (cycleLength - 18) * 24 * 60 * 60 * 1000);
                Date safeEnd = new Date(cycleStartDate.getTime() + (cycleLength - 11) * 24 * 60 * 60 * 1000);

                System.out.println("Here's some information about your cycle:");
                System.out.println("Your next period will start around " + dateFormat.format(periodStart));
                System.out.println("You'll be most fertile around " + dateFormat.format(ovulationDate));
                System.out.println("Your safe days are from " + dateFormat.format(safeStart) + " to " + dateFormat.format(safeEnd));

                System.out.print("Do you want to calculate another cycle? (yes/no): ");
                String anotherCycle = scanner.next().toLowerCase();

                if (!anotherCycle.equals("yes")) {
                    System.out.println("Goodbye!");
                    break;
                }
            } catch (ParseException e) {
                System.out.println("Oops! Something went wrong. Please check your input format and try again.");
            }
        }

        scanner.close();
    }
}


