package Trees.BinaryTree;

public class SameTree {
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
    public static boolean Sametree(Node A,Node B){
        if(A==null&&B==null){
            return true;
        }
        if(A==null||B==null){
            return false;
        }
        if(A.data!=B.data){
            return false;
        }
        return Sametree(A.left,B.left)&&Sametree(A.right,B.right);

    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);
        Node B=new Node(1);
        B.left=new Node(2);
        B.right=new Node(3);
        B.left.left=new Node(4);
        B.left.right=new Node(5);
        B.right.left=new Node(6);

        System.out.println(Sametree(A, B));
    }
}
