import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = getUserInput(scanner);
        countGrades(marks);
    }

    private static int[] getUserInput(Scanner scanner) {
        int[] marks = new int[10];
        System.out.println("Enter 10 marks (out of 100):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        return marks;
    }

    private static void countGrades(int[] marks) {
        int[] gradeCount = new int[5];
        for (int mark : marks) {
            char grade = getGrade(mark);
            switch (grade) {
                case 'A':
                    gradeCount[0]++;
                    break;
                case 'B':
                    gradeCount[1]++;
                    break;
                case 'C':
                    gradeCount[2]++;
                    break;
                case 'D':
                    gradeCount[3]++;
                    break;
                case 'E':
                    gradeCount[4]++;
                    break;
            }
        }
        displayResults(gradeCount);
    }

    private static char getGrade(int mark) {
        if (mark >= 80) {
            return 'A';
        } else if (mark >= 70) {
            return 'B';
        } else if (mark >= 60) {
            return 'C';
        } else if (mark >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }

    private static void displayResults(int[] gradeCount) {
        System.out.println("Grade Count:");
        System.out.println("Grade A: " + gradeCount[0]);
        System.out.println("Grade B: " + gradeCount[1]);
        System.out.println("Grade C: " + gradeCount[2]);
        System.out.println("Grade D: " + gradeCount[3]);
        System.out.println("Grade E: " + gradeCount[4]);
    }
}