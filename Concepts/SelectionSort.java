
public class SelectionSort {

    public static void sort(int arr[]) {
        
        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
  
    public static void main(String[] args) {
        int arr[] = {5, 3, 9, 2, 10};

        sort(arr);
    }
}
