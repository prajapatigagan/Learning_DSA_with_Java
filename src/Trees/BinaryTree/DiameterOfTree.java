package Trees.BinaryTree;

public class DiameterOfTree {
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
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int LH=Height(root.left);
        int RH=Height(root.right);

        return Math.max(LH, RH)+1;
    } 
    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int Ldiam=Diameter(root.left);
        int Rdiam=Diameter(root.right);
        int LH=Height(root.left);
        int RH=Height(root.right);

        int selfdiam=LH+RH;

        return Math.max(selfdiam,Math.max(Ldiam, Rdiam));
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);

        System.out.println(Height(A));
        System.out.println(Diameter(A));
    }
}
