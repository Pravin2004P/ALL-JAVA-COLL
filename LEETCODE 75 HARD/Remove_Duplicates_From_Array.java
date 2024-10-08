public class Remove_Duplicates_From_Array {
    public int removeduplicates (int nums[]) {
        int j = 0;
        for (int i = 0; i<nums.length; i++) {
            if(nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int nums [] = {0,0,1,1,1,2,2,3,3,4};
        Remove_Duplicates_From_Array q = new Remove_Duplicates_From_Array();
         int n = q.removeduplicates(nums);
         System.out.println(n);
         System.out.println("Array after removing duplicates:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}