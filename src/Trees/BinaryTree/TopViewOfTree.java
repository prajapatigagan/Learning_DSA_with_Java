package Trees.BinaryTree;

import java.util.*;

public class TopViewOfTree {
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
    public static class info{
        Node node;
        int hd;
        public info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        } 
    }
    public static void topview(Node root){
        Queue<info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0;
        int max=0;
        q.add(new info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){//first time hd value
                map.put(curr.hd, curr.node);
                }

                if(curr.node.left!=null){
                    q.add(new info(curr.node.left, curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new info(curr.node.right, curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node A=new Node(1);
        A.left=new Node(2);
        A.right=new Node(3);
        A.left.left=new Node(4);
        A.left.right=new Node(5);
        A.right.left=new Node(6);
        A.right.right=new Node(7);

        topview(A);
    }
}
