public class quicksort {
    public static void main(String[] args) {
        int arr[] = {8,7,56,4,3,32,1};
        System.out.println("before : ");
        for(int num:arr) {
            System.out.print(num + " ");
        }
        quicksor(arr, 0, arr.length-1);
        System.out.println("\n after : ");
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
    public static void quicksor(int arr[],int low,int high) {
        if(low<high) {
        int pivot = partitio(arr, low, high);
        quicksor(arr, low, pivot-1);
        quicksor(arr, pivot+1, high);
        }
    }
    public static int partitio(int arr[],int low,int high) {
        int i = (low-1);
        int pivot = arr[high];
        int steps = 0;
        for(int j=low;j<high;j++) {
            steps++;
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        System.out.println();
        System.out.println(" steps :"+steps);
        return i+1;
        
    }
    
}