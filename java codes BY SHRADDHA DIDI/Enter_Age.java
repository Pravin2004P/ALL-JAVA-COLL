import java.util.*;
public class Enter_Age {
    public static void main (String args []) {
        System.out.println("enter your age : ");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
               if (age <= 18) {
                System.out.println("you are a child");
               }
               else if(age>=19 && age<=42) {
                System.out.println("you are young");
               }
               else if(age>=43 && age<=75) {
                System.out.println("you are a man");
               }
               else if(age>=76 && age<=85) {
                System.out.println("you are granny");
               }
               else if(age>=86 && age<=106) {
                System.out.println("you are going to dead");
               }
               else if(age>107) {
                System.out.println("you are dead");
               }
               else{
                System.out.println("enter a valid number");
               }
        }


    }
}
