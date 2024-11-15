import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner Grading = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Step 1: Input number of students
            System.out.print("Enter the number of students: ");
            int numStudents = Grading.nextInt();

            // Variables to store counts of each grade
            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
            int passed = 0, failed = 0;

            // Step 2: Input marks for each student and assign grades
            for (int i = 1; i <= numStudents; i++) {
                System.out.print("Enter marks for student " + i + ": ");
                int marks = Grading.nextInt();
                char grade;

                if (marks >= 90) {
                    grade = 'A';
                    gradeA++;
                    passed++;
                } else if (marks >= 80) {
                    grade = 'B';
                    gradeB++;
                    passed++;
                } else if (marks >= 70) {
                    grade = 'C';
                    gradeC++;
                    passed++;
                } else if (marks >= 60) {
                    grade = 'D';
                    gradeD++;
                    passed++;
                } else {
                    grade = 'F';
                    gradeF++;
                    failed++;
                }

                System.out.println("Student " + i + " got grade: " + grade);
            }

            // Step 3: Display grade counts
            System.out.println("\nGrade Summary:");
            System.out.println("A: " + gradeA);
            System.out.println("B: " + gradeB);
            System.out.println("C: " + gradeC);
            System.out.println("D: " + gradeD);
            System.out.println("F: " + gradeF);

            // Step 4: Display pass and fail counts
            System.out.println("\nPass: " + passed);
            System.out.println("Fail: " + failed);

            // Step 5: Bonus to instructor logic
            if (passed > failed) {
                System.out.println("Bonus to instructor!");
            } else {
                System.out.println("Instructor needs improvement.");
            }

            // Step 6: Ask if the user wants to continue
            System.out.print("\nDo you want to continue? (yes/no): ");
            String response = Grading.next().toLowerCase();
            if (!response.equals("yes")) {
                continueProgram = false;
            }
        }

        Grading.close();
        System.out.println("Program exited.");
    }
}
