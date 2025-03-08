public class HeapWithArr {

    public static void maxHeapify(int[] arr, int n, int i ) {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if( l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if( r<n && arr[r]>arr[largest] ) {
           largest = r;
        }

        if( i != largest ){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, n, largest);
        }
    }

    public static void buildMaxHeap(int[] arr ) {
        int n = arr.length;

        for(int i=n/2-1; i>=0; i--){
            maxHeapify(arr, n, i);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;
        buildMaxHeap(arr);

        for(int i=n-1; i>=0; i--){
            // as this is max heap. the highest element is at the root & the last one is the smallest
            // So swaping the root with the last heap element to bring smallest one at the front
            // and then heapifying aging 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, i, 0);
        }
    }

    public static void print(int arr[]) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};

        heapSort(arr);

        print(arr);
    }
}
