// A pair is said to be onverted  when 
// i<j and A[i] > A[j]

public class CountingInversionsBF {

    public static int countInversion(int[] arr) {
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(i<j && arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};

        System.out.println("Number of inverted pairs: "+countInversion(arr));
    }
}
