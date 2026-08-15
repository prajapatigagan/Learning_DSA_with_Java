package Trees.BinarySearchTree;

public class ValidateBST {
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
    public static Node Insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=Insert(root.left, val);
        }
        else{
            root.right=Insert(root.right, val);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static boolean isValid(Node root,Node max,Node min){
        if(root==null){
            return true;
        }
        if(min!=null&&root.data<=min.data){
            return false;
        }
        else if(max!=null&&root.data>=max.data){
            return false;
        }
        return isValid(root.left, root, min) && isValid(root.right, max, root);    }
    public static void main(String[] args) {
        // int values[]={5,1,3,4,2,7};
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root,values[i]);
        }
        Inorder(root);
        System.out.println();
        if(isValid(root, null, null)){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
