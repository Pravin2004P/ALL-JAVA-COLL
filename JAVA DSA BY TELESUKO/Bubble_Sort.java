public class Bubble_Sort {
    public static void main(String[] args) {
        int nums [] = {2,5,3,1};
        System.out.println("before sorting : ");
        for(int num:nums) {
            System.out.print( " " + num);
        }
            for (int i=0;i<=nums.length-i;i++) {
                for (int j=0;j<nums.length-i-1;j++) {
                    if(nums[j] > nums[j+1]) {

                        int temp = nums [j];
                        nums [j] = nums [j+1];
                        nums[j+1] = temp;
                        
                    }
                }
                System.out.println(" ");
        for(int num:nums) {
            System.out.print( " " + num);
        }
            }
        System.out.println(" \n after sorting : ");
        for(int num:nums) {
            System.out.print( " " + num);
        }
    }
}
