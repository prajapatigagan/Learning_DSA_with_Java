package Trees.BinarySearchTree;

import java.util.ArrayList;

public class LeafPath {
    public static class Node{
        Node left;
        Node right;
        int data;
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
            root.right=Insert(root.right,val);
        }
        return root;
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void print2leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printpath(path);
        }
        print2leaf(root.left, path);
        print2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
         Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root,values[i]);
        }
        Inorder(root);
        System.out.println();
        print2leaf(root, new ArrayList<>());
    }
    
}
