import java.util.Scanner; //Looping

public class SimplePasswordSystem2 {
    private static final String CORRECT_PASSWORD = "DANISH"; 
    private static final int MAX_ATTEMPTS = 3; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int attempts = 0;
            boolean accessGranted = false;

            System.out.println("Welcome! You have " + MAX_ATTEMPTS + " attempts to enter the password.");

            while (attempts < MAX_ATTEMPTS) {
                System.out.print("MASUK PASSWORD NI: ");
                String inputPassword = scanner.nextLine();

                if (inputPassword.equals(CORRECT_PASSWORD)) {
                    accessGranted = true;
                    break; 
                } else {
                    attempts++;
                    System.out.println("SALAH PASSWORD KAU SAPE. Berapa Kali: " + (MAX_ATTEMPTS - attempts));
                }
            }

            if (accessGranted) {
                System.out.println("YEAY DH BERJAYA! MEH MASUK!");
            } else {
                System.out.println("SALAH! KAU JANGAN BUKAK BENDA NI LAGI.");
            }

           
            System.out.print("Nak Try Lagi Tak? (yes/no): ");
            String choice = scanner.nextLine();
            continueProgram = choice.equalsIgnoreCase("yes");
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
} //