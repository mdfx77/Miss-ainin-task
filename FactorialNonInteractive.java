public class FactorialNonInteractive {
    public static void main(String[] args) {
        int n = 6; 
        long factorial = calculateFactorial(n);
        
        System.out.println(n + "! = " + factorial);
    }

    private static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        return result;
    }
}
