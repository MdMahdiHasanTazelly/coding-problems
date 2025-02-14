//counting inversion problem in divide and conquer approach
// A pair is said to be onverted  when 
// i<j and A[i] > A[j]

public class CountingInversion {

    public static int mergeAndCount(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        int inversionCount = 0;

        while(i<=mid && j<=ei){
            if( arr[i]<arr[j] ){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
                //copying form right sub array means, the corresponding left sub-array's value
                // is larger. So, it can form an inversion pair
                inversionCount++;
            }
            k++;
        }

        while (i<=mid) { 
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(i=0, j=si; i<temp.length; j++,i++){
            arr[j] = temp[i];
        }
        return inversionCount;
    }


    public static int findInversion(int[] arr, int si, int ei) {
        if(si>=ei){
            return 0;
        }
        int mid = (si+ei)/2;

        //counting inversions when sorting the LEFT sub array
        int leftInversions = findInversion(arr, si, mid);
        //counting inversions when sorting the RIGHT sub array
        int rightInversions = findInversion(arr, mid+1, ei);
        //counting inversions when merging the LEFT AND RIGHT sub array
        int mergingInversions = mergeAndCount(arr, si, mid, ei);

        return leftInversions+rightInversions+mergingInversions;
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};
        //inversion count 3

        //int[] arr = {1, 2, 3, 4, 5};
        //inversion count 0

        int noOfInversions = findInversion(arr, 0, arr.length-1);
        System.out.println("Number of inversions: "+noOfInversions);

        for(int el : arr){
            System.out.print(el+ " ");
        }
    }

}
