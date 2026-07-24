package Trees.BinaryTree;

import java.util.ArrayList;

public class LowestCommanAnsester {
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

    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data==n){
            return true; 
        }

        getpath(root.left, n, path);

        boolean foundleft=getpath(root.left, n, path);
        boolean foundright=getpath(root.right, n, path);

        if(foundleft||foundright){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node LCA(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        //let comman Ancestor
        int i=0;
        for(;i<path1.size()&& i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        //last equal node
        Node LCA=path1.get(i-1);
        return LCA;
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);

        System.out.println(LCA(A,6, 7).data);
    }
}
