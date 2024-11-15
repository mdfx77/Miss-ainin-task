import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter a sequence of integers (type 'exit' to stop):");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    if (number % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or 'exit'.");
                }
            }

            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.nextLine();
            continueProgram = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}