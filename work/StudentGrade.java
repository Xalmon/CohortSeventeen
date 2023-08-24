package work;
import java.util.Scanner;
import java.util.HashMap;

public class StudentGrade {

    public static int getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Please enter a positive integer.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double getScore(String subjectName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter score for " + subjectName + ": ");
                double score = Double.parseDouble(scanner.nextLine());
                if (score >= 0 && score <= 100) {
                    return score;
                } else {
                    System.out.println("Score must be between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static HashMap<String, HashMap<String, Double>> collectScores(int numStudents, int numSubjects) {
        HashMap<String, HashMap<String, Double>> scores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= numStudents; student++) {
            System.out.println("\nEntering score for student " + student);
            HashMap<String, Double> studentScores = new HashMap<>();
            for (int subject = 1; subject <= numSubjects; subject++) {
                System.out.println("Enter score for subject " + subject);
                String subjectName = scanner.nextLine();
                double score = getScore(subjectName);
                studentScores.put(subjectName, score);
            }
            scores.put("Student " + student, studentScores);
            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully");
        }
        return scores;
    }

    public static void displaySummary(HashMap<String, HashMap<String, Double>> scores) {
        System.out.println("=========================================================================");
        System.out.println("STUDENTS        SUB1    SUB2    SUB3    TOT    AVE      POS");
        System.out.println("=========================================================================");

        int studentCount = 1;
        for (String student : scores.keySet()) {
            System.out.print(student);
            HashMap<String, Double> studentScores = scores.get(student);
            double total = 0;
            for (String subject : studentScores.keySet()) {
                double score = studentScores.get(subject);
                System.out.printf("      %.2f", score);
                total += score;
            }
            double average = total / studentScores.size();
            System.out.printf("    %.2f    %.2f    %d%n", total, average, studentCount);
            studentCount++;
        }

        System.out.println("=========================================================================");
        System.out.println("=========================================================================");

    }


    public static void main(String[] args) {
        System.out.println("Welcome Teacher enter students number and score\n");

        int numStudents = getIntegerInput("How many students do you have? ");
        int numSubjects = getIntegerInput("How many subjects do they offer? ");

        System.out.println("\nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        System.out.println("\nEntering scores...");
        HashMap<String, HashMap<String, Double>> scores = collectScores(numStudents, numSubjects);

        displaySummary(scores);
    }


}

