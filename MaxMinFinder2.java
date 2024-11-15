import java.util.Scanner; //implementing methods.

public class MaxMinFinder2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            int[] numbers = getUserInput(scanner);

            int max = findMax(numbers);
            int min = findMin(numbers);

            displayResults(max, min);

            System.out.print("Do you want to enter another set of integers? (yes/no): ");
            String response = scanner.next();
            continueInput = response.equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thank you for using the MaxMinFinder program!");
    }

    private static int[] getUserInput(Scanner scanner) {
        int[] numbers = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int findMax(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }

    private static int findMin(int[] numbers) {
        return Math.min(numbers[0], Math.min(numbers[1], numbers[2]));
    }

    private static void displayResults(int max, int min) {
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}