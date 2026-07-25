package Trees.BinaryTree;

public class MinimumDistanceTwoNodes {
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
    public static Node LCA2(Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }

        Node leftNca=LCA2(root.left, n1, n2);
        Node rightNca=LCA2(root.right, n1, n2);

        //left LCS=val  rightLCA=null

        if(rightNca==null){
            return leftNca;
        }
        if(leftNca==null){
            return rightNca;
        }

        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=lcaDist(root.left, n);
        int rightdist=lcaDist(root.right, n);

        if(leftdist==-1&&rightdist==-1){
            return -1;
        }
        else if(leftdist==-1){
            return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }
    public static int MinDist(Node root,int n1,int n2){
        
        Node lca=LCA2(root, n1, n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        
        return dist1+dist2;

    }
    public static void main(String[] args) {
         Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);
        int n1=4;
        int n2=5;
        System.out.println(MinDist(A, n1, n2));
    }
    
}
