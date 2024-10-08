
import java.util.Scanner;

public class Linear_And_Binary_Steps {

    public static void main(String[] args) {
        int nums[] = new int[1000];
        for (int i=0;i<nums.length;i++) {
            nums[i] =i;

        }
        System.out.println("Enter the target : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        
        Demo obj = new Demo();
        int result=obj.binarysearch(nums, target);
        if(result!=-1) {
            System.out.println("found at index of binary : "+result);
        }
        else {
            System.out.println("invalid,inter a vallid input");
        }


        int result1=obj.linearsearch(nums, target);
        if(result1!=-1) {
            System.out.println("found at index of linear : "+result1);
        }
        else {
            System.out.println("invalid,,inter a vallid input");
        }
        
    }
}