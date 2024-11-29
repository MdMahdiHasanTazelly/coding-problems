public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 10, 30};
        int key = 7;

        System.out.println(search(arr, key));
    }

    public static int search(int arr[], int key) {
        int start = 0, end = arr.length-1; 
        
        while(start <= end ){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return arr[mid];
            }
            if(key < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }


}
