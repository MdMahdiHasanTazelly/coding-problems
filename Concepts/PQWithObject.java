
import java.util.PriorityQueue;

public class PQWithObject{

    //Comparable is a built in interface for caomparing 2 objects
    public static class Student {
        int rank;
        String name;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 12));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 4));
        pq.add(new Student("D", 7));
        pq.add(new Student("E", 9));

        while( !pq.isEmpty() ){
            System.out.println(pq.peek().name+" ---> "+pq.peek().rank);
            pq.remove();
        }
        
        
    }
}