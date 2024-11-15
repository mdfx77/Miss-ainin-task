import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter a number to display the Fibonacci series up to that number: ");
            int limit = scanner.nextInt();

            System.out.println("Fibonacci series up to " + limit + ":");
            printFibonacciSeries(limit);

           
            System.out.print("Do you want to display another Fibonacci series? (yes/no): ");
            String choice = scanner.next();
            continueProgram = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Program terminated.");
        scanner.close();
    }

    private static void printFibonacciSeries(int limit) {
        int a = 0, b = 1;

       
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b; 
            a = b; 
            b = next; 
        }
        System.out.println();
    }
}
