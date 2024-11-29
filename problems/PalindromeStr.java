//using two pointer approach
public class PalindromeStr{
    public static void main(String[] args) {
        String str = "noon";
        int start=0, end=str.length()-1;
        boolean isPal=true;
        while(start<=end){
            if(str.charAt(end)!=str.charAt(start)){
                isPal=false;
                break;
            }
            start++;
            end--;
        }

       String res = isPal ? "Palindrome" : "Not a palindrome";

       System.out.println(res);
    }
}