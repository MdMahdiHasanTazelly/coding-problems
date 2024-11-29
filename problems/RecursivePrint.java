public class RecursivePrint{
    public static  int print(int n){
        System.out.print(n+" ");
        if(n==0){
            return 0;
        }
        return print(n-1);
    }
    public static void main(String[] args) {
        print(5);
    }
}