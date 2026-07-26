package Trees.BinaryTree;

public class TransformToSumTree {
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
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftsubtree=transform(root.left);
        int rightsubtree=transform(root.right);

        int data=root.data;
        int newLeft=root.left==null ?0:root.left.data;
        int newright=root.right==null ?0:root.right.data;
        root.data=newLeft+leftsubtree+newright+rightsubtree;

        return data;
    }
    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);
       transform(A);
        PreOrder(A);
    }
}
