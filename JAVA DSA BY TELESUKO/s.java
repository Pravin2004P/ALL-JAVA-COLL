public class s{
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2};
        for(int num : arr) {
            System.out.print(num);
        }
    }

    public static void devide (int arr[],int si,int ei) {
        if(si>=ei) {
            return;
        }
        int mid=si + (ei-si);
        devide(arr, si, mid);
        devide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static int conquer (int arr[],int si,int mid,int ei) {
        int merged []= new int [ei-si+1];
            int idx1 = si;
            int idx2 = mid+1;
            int x = 0;
            while(idx1<=mid && idx2 <=ei) {
                if(arr[idx1] <= arr[idx2]) {
                    merged[x++] = arr[idx1++];
                }
                else {
                    merged[x++] = arr[idx2++];
                }
            }
                    while (idx1<=mid) {
                        merged[x] = arr[idx1];
                    }
                    while (mid<=ei) { 
                        merged[x++] = arr[idx2++];
                    }
        return -1;
    }
}