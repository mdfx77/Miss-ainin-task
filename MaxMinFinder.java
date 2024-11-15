import java.util.Scanner; //looping

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            // Prompt user for input
            System.out.println("Enter three integers:");

            // User input for three integers
            System.out.print("Integer 1: ");
            int num1 = scanner.nextInt();
            System.out.print("Integer 2: ");
            int num2 = scanner.nextInt();
            System.out.print("Integer 3: ");
            int num3 = scanner.nextInt();

            // Calculate maximum and minimum using Math class methods
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));

            // Display the results
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another set of integers? (yes/no): ");
            String response = scanner.next();
            continueInput = response.equalsIgnoreCase("yes");
        }

        // Close the scanner
        scanner.close();
        System.out.println("Thank you For This Input!");
    }
}