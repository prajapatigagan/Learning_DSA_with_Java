package Trees.BinaryTree;

public class IsSubtree {
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
    public static boolean isIdentical(Node node,Node subroot){
        if(node==null&&subroot==null){
            return true;
        }else if(node==null||subroot==null||node.data!=subroot.data){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }

        return true;

    }
    public static boolean isSubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);

        Node B=new Node(2);
        B.left=new Node(4);
        B.right=new Node(8);

        System.out.println(isSubtree(A, B));

    }
}
