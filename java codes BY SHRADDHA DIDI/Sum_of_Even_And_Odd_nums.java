public class Sum_of_Even_And_Odd_nums {
    public static void main(String[] args) {
        int n=20;
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                even=even+i;
            }
            else if(i%2!=0) {
                odd=odd+i;
            }
        }
        System.out.println("Addition_of_odd_is: "+odd);
            System.out.println("Addition of even numbers are : "+even);
    }
}
