public class LargestStr{
    public static void main(String[] args) {
        
        String str[] = {"apple", "mango", "banana"};

        String largestStr = str[0];

        for(int i=0; i<str.length; i++){
            if( largestStr.compareTo(str[i]) < 0){
                largestStr = str[i];
            }
        }
        System.out.println(largestStr);
    }
}