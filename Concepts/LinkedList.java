public class LinkedList{ 
    
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head, tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
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


    public void mid(int data, int idx){
        Node newNode = new Node(data);
        int i=0;
        Node temp = head;

        while (i< idx-1) { 
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public int removeFirst(){
        int val = head.data;
        if(head == null){
            head = tail = null;
            return val;
        }
        head = head.next;
        return val;
    }


    public int removeLast(){
        Node temp = head;
        int val = head.data;

        if(head == tail){
            head = tail = null;
            return val;
        }
        while(temp.next.next != null){
            temp = temp.next;
            val = temp.next.data;
        }
        temp.next = null;
        return  val;
    }


    public void print(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        ll.mid(9, 3);
        ll.print();

        ll.removeFirst();
        ll.print();

        System.out.println(ll.removeLast());;
        ll.print();
       
    }
    
}