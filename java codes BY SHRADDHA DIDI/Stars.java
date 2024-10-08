public class Stars {
    public static void main(String[] args) {
        int a = 5;
        
        // Upper part
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int m = 2 * (a - i);
            for(int j = 1; j <= m; j++) {
                System.out.print(" ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Lower part
        for(int i = a - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int m = 2 * (a - i);
            for(int j = 1; j <= m; j++) {
                System.out.print(" ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
