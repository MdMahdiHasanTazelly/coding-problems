
public class QueueWithArrPrac{
    public static class Queue{
        public static int size;
        public static int arr[];
        public static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];

            for(int i=0; i<size-1; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            size--;
            return front;
        }

        public static boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;
        }

        public static void print(){
            for(int i=0; i<rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        System.out.println(q.isEmpty());

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.print();

        System.out.println(q.remove());

        q.print();
    }
}