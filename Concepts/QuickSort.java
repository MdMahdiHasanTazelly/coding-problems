// Best case TC- nlogn
// worst case TC- n^2 [when sorted]
// No extra space is required for sorting

public class QuickSort {

    public static int partition(int[] arr, int si, int ei) {
        // assuming last element as pivot            
        int pivot = arr[ei];
        int  i = si-1;
        for(int j=si; j<ei; j++){
            if( arr[j]<=pivot ){
                // swaping the lesser values of pivot
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swaping the pivot in right place
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        //returning pivot's index
        return i;
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if( si>=ei ){
            return;
        }
        // partition returns the pivot element's updated index
        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx-1);  //for left part of pivot
        quickSort(arr, pIdx+1, ei);  //for right part of pivot
    }


    public static void print(int[] arr) {
        for(int el: arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length-1);

        print(arr);
    }
}
