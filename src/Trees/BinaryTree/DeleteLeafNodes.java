package Trees.BinaryTree;

public class DeleteLeafNodes {
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
    public static Node deleteLeaf(Node root,int x){
        if(root==null){
            return null;
        }
        root.left=deleteLeaf(root.left,x);
        root.right=deleteLeaf(root.right,x);

        if(root.left==null&&root.right==null&&root.data==x){
            return null;
        }

        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(2);
        A.left.left=new Node(2);
        A.left.right=new Node(5);
        A.right.left=new Node(2);
        A.right.right=new Node(7);
        System.out.println("Before:");
    preorder(A);

    A = deleteLeaf(A, 2);

    System.out.println("\nAfter:");
    preorder(A);
    }
}
