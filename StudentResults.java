import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int passed = 0;
        int failed = 0;

        for (int i = 1; i < numberOfStudents+1; i++) {
            System.out.print("Enter result for student " + i + " (pass/fail): ");
            String result = scanner.next().toLowerCase();  

            if (result.equals("pass")) {
                passed++;
            } else if (result.equals("fail")) {
                failed++;
            } else {
                System.out.println("Invalid input. Please enter 'pass' or 'fail'.");
                i--; 
            }
        }


        System.out.println("\nNumber of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);


        if (passed > (numberOfStudents / 2)) {
            System.out.println("Tahniah kau Pandai Mengajar");
        }
    }
}
