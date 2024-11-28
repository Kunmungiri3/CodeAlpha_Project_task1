import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        // Initialize variables and ArrayList
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Tracker");
        System.out.println("Enter student grades. Type '-1' to finish.");

        // Input grades
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            if (grade == -1) { // Sentinel value to end input
                break;
            } else if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        // Check if any grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Calculate and display average, highest, and lowest grades
            double total = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);

            for (double grade : grades) {
                total += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = total / grades.size();
            System.out.println("\nGrade Summary:");
            System.out.printf("Average: %.2f%n", average);
            System.out.printf("Highest: %.2f%n", highest);
            System.out.printf("Lowest: %.2f%n", lowest);
        }

        scanner.close();
    }
}
