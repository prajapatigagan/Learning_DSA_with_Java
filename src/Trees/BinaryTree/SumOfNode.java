package Trees.BinaryTree;

public class SumOfNode {
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
    public static int SumNode(Node root){
        if(root==null){
            return 0;
        }

        int LS=SumNode(root.left);
        int RS=SumNode(root.right);

        return LS+RS+root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Total Sum : "+SumNode(root));
    }
}
