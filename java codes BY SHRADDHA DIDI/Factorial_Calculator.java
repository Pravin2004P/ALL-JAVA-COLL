
import java.util.Scanner;

class f {
    public int g (int a) {
        if(a<0) {
            System.out.println("INVALID");
            return 0;
        }
        int fact=1;
        for(int i = a;i>=1;i--) {
            fact=fact*i;
        }
        return fact;
    }
}
    public class Factorial_Calculator {
    public static void main(String[] args) {
        System.out.println("enter the value : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();        
        f obj = new f();
        int result = obj.g(a);

        System.out.println("the result is : "+ result);
    }
    
}
