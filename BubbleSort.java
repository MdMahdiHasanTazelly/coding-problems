public class BubbleSort {

    //ascending order
    public static void sort(int arr[]) {
        for(int turn=0; turn< arr.length-1 ; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if( arr[j+1] < arr[j] ){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    //descending order
    public static void sort1(int arr[]) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if( arr[j+1] > arr[j] ){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        print(arr);
    }

    public static void print(int arr[]){
        for (int el : arr) {
            System.out.print(el+" ");
        }
    }


    public static void main(String[] args) {
        
        int arr[] = {3, 5, 1, 6, 0};

        sort1(arr);
    }
}
