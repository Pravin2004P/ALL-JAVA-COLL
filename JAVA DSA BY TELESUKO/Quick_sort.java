public class Quick_sort {

        public static int partition (int arr[],int low ,int high) {
          int pivot = arr[high];
          int i =low-1;
          for(int j =low;j<high;j++) {
            if(arr [j] < pivot) {
              i++;
              int temp = arr[i];
              arr[i] = arr [j];
              arr [j] = temp;    
            }
          }

          int temp = arr[i+1];
          arr [i+1] = arr[high];
          arr[high] = temp;
          return i+1;
        }

        public static void quicksort (int arr[],int low ,int high) {
          if(low < high) {
            int pivot = partition(arr,low,high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
          }
      }

      public static void main(String[] args) {
          int arr [] = {8,7,5,4,3};
          int n=arr.length;
          quicksort(arr,0, n-1);
          
          for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
          }
      }
}
    