import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converter available:");
        System.out.println("1. Currency (MYR - SGD)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - m)");
        System.out.print("Choose your converter: ");
        int choice = scanner.nextInt();

        System.out.print("Insert Amount/Quantity: ");
        double amount = scanner.nextDouble();

        switch (choice) {
            case 1:
                double exchangeRate = 0.2988; // Example exchange rate for MYR to SGD
                System.out.printf("MYR %.2f = SGD %.4f%n", amount, amount * exchangeRate);
                break;
            case 2:
                System.out.printf("%.2f kg = %.4f pounds%n", amount, amount * 0.29881576);
                break;
            case 3:
                System.out.printf("%.2f km = %.2f meters%n", amount, amount * 1000);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
} //DANISH FAIQ