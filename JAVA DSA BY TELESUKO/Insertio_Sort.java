public class Insertio_Sort {
    public static void main(String[] args) {
        int arr [] = {7,8,3,1,2};
        int steps=0;
        System.out.println(" before sort :");
       for(int num:arr) {
            System.out.print(num+ " ");
        }
        System.out.println();
        for (int i = 1;i<arr.length;i++) {
            int key = arr[i];
            int j = i-1;
            steps++;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;   
            System.out.println();
            for(int num:arr) {
                System.out.print(num+ " ");
            }
        }
        System.out.println();
        System.out.println("\nit took steps : "+steps);
        
        System.out.println(" \nafter sort :");
       for(int num:arr) {
            System.out.print(num+ " ");
        }
    }
}
