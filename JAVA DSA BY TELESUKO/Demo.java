public class  Demo {
    public int linearsearch(int nums[],int target) {
        int steps = 0;
        for(int i=0;i<nums.length;i++) {
            steps++;
            if(nums [i]==target) {
                System.out.println("steps taken by linear: "+steps);
                return i;
            }
          
        }

        return -1;
    }
    public int binarysearch (int [] nums,int target) {
        int left=0;
        int right=nums.length-1;
        int steps=0;
        while (left <= right) {
            steps ++;
            int mid=left+(right-left)/2;
            if(nums[mid]==target) {
                System.out.println("steps taken by binary: "+steps);
                return mid;
            }
            else if (nums [mid] < target) {
                left=mid+1;
            }
            else right = mid-1;
        }

        return -1;
    }

}
