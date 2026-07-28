package Trees.BinaryTree;

public class InvertBinaryTree {
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
    public static Node Invert(Node root){
        if(root==null){
            return null;
        }

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        Invert(root.left);
        Invert(root.right);

        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);
        Invert(A);
        preorder(A);
    }
}
