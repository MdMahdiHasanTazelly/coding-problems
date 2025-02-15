//as card insertion
//STABLE  SORT because of arr[i]>key [***not stable in arr[i]>=key***]

// pseudocode:-
// insertionSort(A, n)
// for(j=2 to n)
//     i=j-1
//     key = arr[j]
//     while i>=0 and key>arr[i]
//         arr[i+1] = arr[i]
//         i--
//     arr[i+1] = key;


public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 8, 0};
        sort(arr);
    }

    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void sort(int arr[]) {
        
        for(int j=1; j<arr.length; j++){
            int i = j-1;
            int key = arr[j];

            while(i >= 0 && key<arr[i] ){
                arr[i+1] = arr[i];
                i--;   
            }
            arr[i+1] = key;
        }

        print(arr);
    }
}
