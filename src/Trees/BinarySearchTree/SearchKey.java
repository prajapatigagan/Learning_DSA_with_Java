package Trees.BinarySearchTree;

public class SearchKey {
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
    public static boolean Search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return Search(root.left,key);
        }
        else{
            return Search(root.right,key);
        }
    }
    public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
         Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root,values[i]);
        }
        InOrder(root);
        System.out.println();

        if(Search(root, 6)){
            System.out.println("Fount");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
