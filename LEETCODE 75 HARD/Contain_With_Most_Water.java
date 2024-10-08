public class Contain_With_Most_Water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxarea = 0;    
        while(left < right) {
            int lefthight = height[left];
            int righthight = height[right];
            int minheight = Math.min(lefthight, righthight);
            int length = right-left;
            int currarea = minheight * length; 
            maxarea = Math.max(maxarea, currarea);
            if (lefthight<righthight) {
                left++;
            }
            else {
                right--;
            } 
        }   
        return maxarea;
    }
    public static void main (String args[]) {
       int [] height = {3,4,2,5,7,6};
       Contain_With_Most_Water p = new Contain_With_Most_Water();
       int result = p.maxArea(height);
        System.out.println(result);
    }
}