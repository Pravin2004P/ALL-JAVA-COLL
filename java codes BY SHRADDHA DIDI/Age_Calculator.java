import java.util.*;
public class Age_Calculator {
    public static void main(String[] args) {
        System.out.println("enter your birt year : ");
        Scanner sc = new Scanner(System.in);
        int year=2024;
        int age = sc.nextInt();
        int output=year-age;
        System.out.println( "you are now " + output +" year old");
    }
    
}