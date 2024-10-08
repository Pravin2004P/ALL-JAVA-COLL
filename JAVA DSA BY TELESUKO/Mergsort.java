public class Mergsort {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merged [] = new int[ei-si+1];
        int index1=si;
        int index2 = mid+1;
        int x=0;
         int idx = 0;
        while (index1 <=mid && index2 <= ei) {
           if(arr[index1]<=arr[index2]) {
            merged[x++] = arr[index1++];
           }
           else {
            merged[x++] = arr[index2++];
           }
        }
        while (index1<=mid) {
            merged[x++] = arr[index1++];
        }
        while(index2<=ei) {
            merged[x++] = arr[index2++];
        }
        for(int i = 0,j=si;i<merged.length;i++,j++) {
            arr [j] = merged[i];
        }

    }

    public static void devid(int arr [] , int si,int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        devid(arr, si, mid);
        devid(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    } 

    public static void main(String[] args) {
        int arr [] = {9,8,7,6,5,4,3,2};
        int n=arr.length;
        devid(arr, 0, n-1);
        for(int i=0;i<n;i++) {
            System.out.print(arr [i] + " ");
        }
        System.out.println();
    }
}