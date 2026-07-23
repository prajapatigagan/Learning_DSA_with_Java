package Trees.BinaryTree;

public class CountOfNodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static int CountNode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        int LC=CountNode(root.left);
        int RC=CountNode(root.right);

        return LC+RC+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        root.right.right.right=new Node(9);
        root.right.right.right.right=new Node(10);
        System.out.println(CountNode(root));
    }
}
