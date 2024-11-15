import java.util.Scanner;

public class PurchasingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our purchasing system!");
        System.out.println("Please select a product type:");
        System.out.println("1. Car");
        System.out.println("2. Zakwam2");
        System.out.println("3. Clothing");

        int productType = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String productName;
        double productPrice;
        int quantity;

        switch (productType) {
            case 1:
                productName = "car";
                productPrice = 50.0;
                break;
            case 2:
                productName = "zakwam";
                productPrice = 1.0;
                break;
            case 3:
                productName = "Clothing";
                productPrice = 30.0;
                break;
            default:
                System.out.println("Invalid product type. Exiting...");
                return;
        }

        System.out.println("You have selected " + productName);
        System.out.println("Enter the quantity:");
        quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        double totalPrice = productPrice * quantity;

        System.out.println("Order Summary:");
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + productPrice);
        System.out.println("Total Price: $" + totalPrice);

        System.out.println("Would you like to proceed with the order? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order cancelled.");
        }
    }
}