public class Print_Even_Nums {
    public static void main(String[] args) {
        int n=55;
        for (int i = 1; i <= n; i++) {
         if(i%2==0) {
            System.out.println("even number is: "+ i);
         }
         else if (i%2!=0) {
             System.out.println("odd number is: "+i);
         }
        }
    }
    
}
