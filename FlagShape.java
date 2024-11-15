public class FlagShape {
    public static void main(String[] args) {
        int height = 5;
        int width = 30;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= height; i++) {
            System.out.print("|"); 
            System.out.println();   
        }
    }
}