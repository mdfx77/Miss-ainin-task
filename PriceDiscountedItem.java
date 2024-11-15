/*package arithmeticprog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceDiscountedItem {
    private String itemName;
    private double price;
    private int quantity;
    private double discountRate;

    public PriceDiscountedItem(String itemName, double price, int quantity, double discountRate) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.discountRate = discountRate;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public double getDiscountedPrice() {
        return getTotalPrice() - (getTotalPrice() * discountRate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display color code menu for discount rate
        System.out.println("Color Code Discount Menu:");
        System.out.println("1. Red (10% discount)");
        System.out.println("2. Blue (15% discount)");
        System.out.println("3. Green (20% discount)");
        System.out.println("4. Yellow (25% discount)");
        System.out.println("5. Other (no discount)");

        System.out.println("Enter item name:");
        String itemName = scanner.nextLine();

        System.out.println("Enter item price:");
        double price;
        while (true) {
            try {
                price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid price.");
                scanner.next(); // consume the invalid input
            }
        }

        System.out.println("Enter item quantity:");
        int quantity;
        while (true) {
            try {
                quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid quantity.");
                scanner.next(); // consume the invalid input
            }
        }

        System.out.println("Choose a color code for discount rate:");
        int colorCode;
        while (true) {
            try {
                colorCode = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid color code.");
                scanner.next(); // consume the invalid input
            }
        }

        // Set discount rate based on color code
        double discountRate;
        switch (colorCode) {
            case 1:
                discountRate = 0.10;
                break;
            case 2:
                discountRate = 0.15;
                break;
            case 3:
                discountRate = 0.20;
                break;
            case 4:
                discountRate = 0.25;
                break;
            default:
                discountRate = 0.00;
        }

        PriceDiscountedItem item = new PriceDiscountedItem(itemName, price, quantity, discountRate);

        System.out.println("Item Name: " + item.itemName);
        System.out.println("Price per item: " + item.price);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Total Price: " + item.getTotalPrice());
        System.out.println("Discount Rate: " + (item.discountRate * 100) + "%");
        System.out.println("Price After Discount: " + item.getDiscountedPrice());
    }
}*/