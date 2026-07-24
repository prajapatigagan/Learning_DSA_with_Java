package Trees.BinaryTree;

public class KthLevel {
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
    public static void Klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data+" ");
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);

        Klevel(A, 1, 3);
    }
    
}
