// Heap is a Complete Binary Tree and having a order property of filling up from left to right

// MIN HEAP

import java.util.*;

public class Heaps {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);

            //child index
            int x = arr.size()-1;
            //parent index
            int par = (x-1)/2;

            //as it's min heap, so parent node must be larger then child nodes
            //till then, swapping keeps going
            while( arr.get(x)>arr.get(par) ){
                int temp = arr.get(x);
                // putting parent element in the child's place
                arr.set( x, arr.get(par) );
                //putting child element in the parent's place
                arr.set( par, temp );

            }
        }

    }

    public static void main(String[] args) {
        
    }
}
