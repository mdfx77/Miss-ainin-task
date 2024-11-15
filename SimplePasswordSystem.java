import java.util.Scanner;

public class SimplePasswordSystem {
    private static final String CORRECT_PASSWORD = "FAIQHENSEM"; 
    private static final int MAX_ATTEMPTS = 3; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Welcome! You have " + MAX_ATTEMPTS + " attempts to enter the password.");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("MASUK PASSWORD NI: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("YEAY DH BERJAYA! MEH MASUK!");
                return; 
            } else {
                attempts++;
                System.out.println("SALAH PASSWORD KAU SAPE. BERAPA KALI: " + (MAX_ATTEMPTS - attempts));
            }
        }

        System.out.println("SALAH! KAU JANGAN BUKAK BENDA NI LAGI.");
        scanner.close();
    }
}