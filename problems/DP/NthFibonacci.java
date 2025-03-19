// Usually have O(2^n) TC
// Using DP TC-> O(n)

public class NthFibonacci {

    public static int fib(int n, int fib[]) {
        // as all the elements are 0 by default
        // if any non-zero num exist that is the nth(index) calculated fibonacci num
        if( fib[n]!=0 ){
            return fib[n];
        }

        if( n==0 || n==1){
            return n;
        }
      
        fib[n] = fib(n-1, fib)+fib(n-2, fib);
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 6;
        // as 0 based indexing, to store nth fibonacci num the array 
        // must be of n+1 length
        int fib[] = new int[n+1];

        System.out.println( fib(n, fib) );
    }
}
