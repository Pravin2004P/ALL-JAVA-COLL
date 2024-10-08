public class Sort_An_Array_not {
    public int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = {3, 4, 2, 5, 7, 6};
        Sort_An_Array_not s = new Sort_An_Array_not();
        System.out.println(s.sortArray( nums));
    }
}
