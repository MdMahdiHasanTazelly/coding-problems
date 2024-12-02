public class StackPrac{
    public static class Stack{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static Node head, tail;

        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }


        public static void push(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }


        public static int pop(){
            if(head == null){
                return -1;
            }
            int val = head.data;
            head = head.next;

            return val;
        }


        public static int peek(){
            if(head == null){
                return -1;
            }
            return head.data;
        }


        public static void print(){
            Node curr = head;

            while(curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        }



    }


    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(7);
        s.push(6);
        s.push(8);

        s.print();

        System.out.println(s.peek());

        s.pop();

        s.print();
    }

    
}