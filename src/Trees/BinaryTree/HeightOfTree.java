package Trees.BinaryTree;

public class HeightOfTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int Lh=Height(root.left);
        int Rh=Height(root.right);
        return Math.max(Rh, Rh)+1;
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

        System.out.println(Height(root));
        
    }
}
