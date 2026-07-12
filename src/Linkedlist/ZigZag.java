package Linkedlist;

public class ZigZag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void zigZag(){
        //find mid
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse second half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while (curr!=null) { 
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alternate merging->zigzag pattern

        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
            
        }
    }
    public static void main(String[] args) {
        ZigZag list=new ZigZag();
        list.addlast(0);
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);

        list.printList();
        list.zigZag();
        list.printList();
    }
    
}
