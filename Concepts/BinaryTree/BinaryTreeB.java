
public class BinaryTreeB {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1){
                return  null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
        }
    }
   public static void main(String[] args) {
      int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1};

   } 
}
