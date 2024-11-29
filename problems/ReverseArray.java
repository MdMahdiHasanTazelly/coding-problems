
//using two pointer approach in the existing array

public class ReverseArray {
    public static int[] reverse(int arr[]) {
        int start=0, end = arr.length-1;

        while(start <= end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 7};

        int res[] = reverse(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
