package work;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();


            String[] studentNames = new String[numStudents];
            double[][] subjectScores = new double[numStudents][];

            for (int counter = 0; counter < numStudents; counter++) {
                System.out.print("Enter student's name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                studentNames[counter] = name;

                System.out.print("Enter the number of subjects for " + name + ": ");
                int numSubjects = scanner.nextInt();

                double[] scores = new double[numSubjects];
                for (int counter2 = 0; counter2 < numSubjects; counter2++) {
                    System.out.print("Enter score for subject " + (counter2 + 1) + ": ");
                    scores[counter2] = scanner.nextDouble();
                }

                subjectScores[counter] = scores;
            }

            System.out.println("\nStudent Scores:");
            System.out.println(">>>>>>>>>>>>>>");

            for (int counter3 = 0; counter3 < numStudents; counter3++) {
                System.out.print(studentNames[counter3] + ": ");
                for (int counter4 = 0; counter4 < subjectScores[counter3].length; counter4++) {
                    System.out.print(subjectScores[counter3][counter4] + " ");
                }
                System.out.println();
            }
    }
}

