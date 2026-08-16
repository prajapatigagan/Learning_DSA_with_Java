package Trees.BinarySearchTree;

public class MirrorABST {
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
    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static Node Mirror(Node root){
        if(root==null){
            return null;
        }
        Node LeftMirror=Mirror(root.left);
        Node RightMirror=Mirror(root.right);

        root.left=RightMirror;
        root.right=LeftMirror;

        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        
        Preorder(root);
        System.out.println();

        root=Mirror(root);
        Preorder(root);

    }
}
