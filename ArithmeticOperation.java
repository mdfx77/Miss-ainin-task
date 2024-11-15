/*import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the arithmetic operation menu
        System.out.println("Arithmetic Operation Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        // Loop until the user chooses to exit
        while (true) {
            // Prompt the user to enter their choice
            System.out.println("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            // If the user chooses to exit, break out of the loop
            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            // Prompt the user to enter the first number
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user to enter the second number
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform the chosen arithmetic operation
            switch (choice) {
                case 1:
                    // Addition
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    // Subtraction
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    // Multiplication
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    // Division
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}*/
