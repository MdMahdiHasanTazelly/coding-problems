public class FullPyramid{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            //for left pyramid
            for(int j=5-i; j>=1; j--){ //prints space
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){  //prints stars
                System.out.print(" *");
            }

            //for right pyramids
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
            
        }
    }
}