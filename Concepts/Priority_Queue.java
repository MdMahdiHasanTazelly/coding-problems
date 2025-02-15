// In JCF PQ implements min-heap by default --> means lowest priotity value is dequeued first
// In min-heap, smallest element gets the lowest priority

import java.util.PriorityQueue;

public class Priority_Queue{
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        //takes O(logn) in every adding
        pq.add(7);
        pq.add(6);
        pq.add(5);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(1);

        while( !pq.isEmpty() ){
            // takes O(1) times to peek
            System.out.print(pq.peek()+ " ");
            // takes O(logn) to remove an element
            pq.remove();
        }
        System.out.println();

        
        
    }
}