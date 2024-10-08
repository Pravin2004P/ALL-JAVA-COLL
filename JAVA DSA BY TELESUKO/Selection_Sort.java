public class Selection_Sort {
public static void main(String[] args) {
    int nums [] = {7,8,3,1,2}; 
    int minindex = 0;
    int temp=0;
    int steps=0;
    System.out.println("Before sorting : ");
    for(int num:nums) {
        System.out.print(num + " ");
    }
    for(int i=0;i<nums.length-1;i++) {
        minindex = i;
        for (int j=i;j<nums.length;j++) {  
            if(nums[j]<nums[minindex]) {
                minindex =j;        
           }
        }
        temp=nums[minindex];
        nums[minindex] = nums[i];
        nums[i] = temp;

        steps ++;
        System.out.println("step : "+steps);
        for(int num:nums) {
            System.out.print(num + " ");
        }
    }
        System.out.println();
    System.out.println("After sort : ");
    for(int num:nums) {
        System.out.print(num + " ");
    }
  }
}