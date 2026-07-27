package Trees.BinaryTree;

public class UnivaluedOrNot {
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
    public static boolean helper(Node root,int value){
        if(root==null){
            return true;
        }
        if(root.data!=value){
            return false;
        }
        return helper(root.left, value)&&helper(root.right, value);
    }
    public static boolean Univalued(Node root){
        if(root==null){
            return true;
        }
        return helper(root, root.data);
        
    }
    public static void main(String[] args) {
        Node A = new Node(1);
        A.left = new Node(1);
        A.right = new Node(1);
        A.left.left = new Node(1);
        A.left.right = new Node(1);
        A.right.left = new Node(1);
        A.right.right = new Node(1); 
        System.out.println(Univalued(A));
        
    }
}
