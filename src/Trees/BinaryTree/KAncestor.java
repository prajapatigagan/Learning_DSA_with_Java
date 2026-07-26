package Trees.BinaryTree;

public class KAncestor {
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
    public static int Kancestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int leftdist=Kancestor(root.left, n, k);
        int rightdist=Kancestor(root.right, n, k);

        if(leftdist==-1&&rightdist==-1){
            return -1;
        }
        int max=Math.max(leftdist,rightdist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);
        Kancestor(A, 5, 1);
    }
    
}
