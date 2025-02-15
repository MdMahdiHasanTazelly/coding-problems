//time complexity --------> nlogn
//space complexity -------> n

//PSEUDO CODE
//merge(arr, si, mid, ei){
//     int[] temp = new int[ei-si+1]
//     int k = 0
//     int i = si, j = ei
//     while i<= si and j<=ei{
//         if arr[i]<arr[j]{
//             temp[k] = arr[i]
//             i++
//         }else{
//             temp[k] = arr[j]
//             j++
//         }
//         k++
//     }
//     while i<=mid {
//         temp[k++] = arr[i++]
//     }
//     while j<=ei {
//         temp[k++] = arr[j++]
//     }
// 
//     for i=0, j=0; j<length of temp; i++{
//         arr[i] = temp[j++]
//     }
//}


public class MergeSort {

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int k = 0;
        int i = si;
        int j = mid+1;

        while( i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //if any elements remains in the left sorted part of the array
        while( i<= mid){
            temp[k++] = arr[i++];
        }

        //if any elements remains in the right sorted part of the array
        while( j<= ei){
            temp[k++] = arr[j++];
        }

        for(int p=0, q=si; p<temp.length; p++, q++){
            arr[q] = temp[p];
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if( si>=ei ){
            return;
        }

        int mid = (si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 0, 1, 4, 2, 10};

        mergeSort(arr, 0, arr.length-1);

        for (int el : arr) {
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
