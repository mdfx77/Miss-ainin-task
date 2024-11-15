import java.util.Scanner;

public class EnhancedGradingSystem2 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // Scanner object for user input
        boolean continueProgram = true;  // Boolean to control program continuation

        while (continueProgram) {
            // Step 1: Input number of students
            System.out.print("Enter the number of students: ");
            int numberOfStudents = inputScanner.nextInt(); // Number of students

            // Step 2: Initialize counters for grades and pass/fail
            int countGradeA = 0, countGradeB = 0, countGradeC = 0, countGradeD = 0, countGradeF = 0;
            int countPassed = 0, countFailed = 0;

            // Step 3: Process each student's marks
            for (int studentIndex = 1; studentIndex <= numberOfStudents; studentIndex++) {
                System.out.print("Enter marks for student " + studentIndex + ": ");
                int studentMarks = inputScanner.nextInt(); // Marks for each student

                // Step 4: Determine grade and update counters
                char studentGrade = determineGrade(studentMarks); // Method to determine grade
                updateGradeCounters(studentGrade, countGradeA, countGradeB, countGradeC, countGradeD, countGradeF); // Method to update grade counts

                // Update pass/fail counters
                if (studentGrade != 'F') {
                    countPassed++;
                } else {
                    countFailed++;
                }

                System.out.println("Student " + studentIndex + " got grade: " + studentGrade);
            }

            // Step 5: Display results summary
            displayGradeSummary(countGradeA, countGradeB, countGradeC, countGradeD, countGradeF); // Method to display grade summary
            displayPassFailSummary(countPassed, countFailed); // Method to display pass/fail summary

            // Step 6: Bonus or improvement feedback
            giveInstructorFeedback(countPassed, countFailed); // Method to provide feedback

            // Step 7: Ask if user wants to continue
            System.out.print("\nDo you want to continue? (yes/no): ");
            String userResponse = inputScanner.next().toLowerCase(); // User's response to continue or exit
            if (!userResponse.equals("yes")) {
                continueProgram = false; // Exit the loop if user says no
            }
        }

        inputScanner.close(); // Close the scanner
        System.out.println("Program exited.");
    }

    // Method 1: Determine the grade based on student marks
    public static char determineGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method 2: Update the grade counters
    public static void updateGradeCounters(char grade, int countA, int countB, int countC, int countD, int countF) {
        switch (grade) {
            case 'A':
                countA++;
                break;
            case 'B':
                countB++;
                break;
            case 'C':
                countC++;
                break;
            case 'D':
                countD++;
                break;
            case 'F':
                countF++;
                break;
        }
    }

    // Method 3: Display the summary of grades
    public static void displayGradeSummary(int countA, int countB, int countC, int countD, int countF) {
        System.out.println("\nGrade Summary:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("F: " + countF);
    }

    // Method 4: Display the pass/fail summary
    public static void displayPassFailSummary(int passed, int failed) {
        System.out.println("\nPass: " + passed);
        System.out.println("Fail: " + failed);
    }

    // Method 5: Provide feedback to the instructor
    public static void giveInstructorFeedback(int passed, int failed) {
        if (passed > failed) {
            System.out.println("Bonus to instructor!");
        } else {
            System.out.println("Instructor needs improvement.");
        }
    }
}