public class SquareSum {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Squares of numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.print(i + "^2 = " + square + ", ");
            sum += square;
        }

        System.out.println("\nSum of squares: " + sum);
    }
}