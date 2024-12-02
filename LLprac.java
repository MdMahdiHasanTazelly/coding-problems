




public class LLprac{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head, tail;

    public void addFirst(int n){
        Node newNode = new Node(n);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public void addMid(int data, int idx){
        Node newNode = new Node(data);
        int i=0;
        Node temp = head;

        while(i<idx-1){
            //System.out.print(i+" ");
            i++;
            temp = temp.next;
            
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        int val = head.data;
        if(head == tail){
            head = tail = null;
            return val;
        }
        head = head.next;
        return val;
    }

    public int removeLast(){
        Node curr = head;
        int val = curr.data;
        if(head == tail){
            head = tail = null;
            return val;
        }
        while(curr.next.next != null){
            curr = curr.next;
            val = curr.data;
        }
        curr.next = null;
        return val;
    }


    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        LLprac ll = new LLprac();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();

        ll.addMid(0, 3);
        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        
    }
}