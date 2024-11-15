import java.util.Scanner;

public class SalesCommissionCalculator {
    private static final double BASE_SALARY = 600.0; 
    private static final double COMMISSION_RATE = 0.05; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the total gross sales for the week (in RM): ");
        double grossSales = scanner.nextDouble();

        
        double commission = grossSales * COMMISSION_RATE;

        
        double totalEarnings = BASE_SALARY + commission;

        
        System.out.printf("Salesman’s Earnings for the week: RM %.2f%n", totalEarnings);
        System.out.printf("Commission earned: RM %.2f%n", commission);

        scanner.close();
    }
}