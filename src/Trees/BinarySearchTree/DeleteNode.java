package Trees.BinarySearchTree;

public class DeleteNode {
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
    public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static Node Delete(Node root,int val){
        if(root.data<val){
            root.right=Delete(root.right, val);
        }
        else if(root.data>val){
            root.left=Delete(root.left, val);
        }
        else{
            //case 1->No chaild
            if(root.left==null&&root.right==null){
            return null;
            }
            //case 2->single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3-> both children..
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=Delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
         Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root,values[i]);
        }
        InOrder(root);
        System.out.println();

        root=Delete(root, 8);
        System.out.println();
        InOrder(root);
    }
}
