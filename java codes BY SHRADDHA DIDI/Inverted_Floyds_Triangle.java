public class Inverted_Floyds_Triangle {
        public static void main(String[] args) {
                int a=4;
                int n=1;
                for(int i=0;i<=a;i++) {
                    for(int j=0;j<=a-i-1;j++) {
                        System.out.print(n  + " ");
                        n++;
                    }
                    System.out.println(" ");
        
                }
        }
    
}
