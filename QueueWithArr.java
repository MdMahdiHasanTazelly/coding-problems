public class QueueWithArr{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full!");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(rear == -1){
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = arr[0];

            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(rear == -1){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[0];
        }


        public static void print(){
            for(int i=0; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


    


    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        q.print();

        System.out.println(q.peek());;

        System.out.println(q.remove());

        q.print();

    }
}