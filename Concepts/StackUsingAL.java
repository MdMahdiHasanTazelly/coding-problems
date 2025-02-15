//LIFO

import java.util.ArrayList;

public class StackUsingAL{
    public static class Stack{

        static ArrayList<Integer> list = new ArrayList<>();

        //checks if the Stack is empty or not
        public static boolean  isEmpty(){
            return list.size() == 0;
        }

        //push a value at the end of the stack
        public static void push(int data){
            list.add(data);
        }

        //delete a value from the end of the stack
        public static int pop(){
            // when the stack is empty
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);

            return top;
        }

        //only returns the top value of the stack (dosent delete top)
        public static int peek(){
            return list.get(list.size()-1);
        }

        //prints the stack
        public static void print(){

            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);;
        s.push(3);
        s.push(4);

        s.print();

        System.out.println(s.peek());

        s.pop();
        s.print();

    }
}