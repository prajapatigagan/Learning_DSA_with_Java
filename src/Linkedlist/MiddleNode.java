package Linkedlist;

public class MiddleNode {
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

    public static void addlast(int data){
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
        System.out.println("Null");
    }
    //find mid
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static void main(String[] args) {
        MiddleNode ll=new MiddleNode();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(8);
        ll.addlast(1);
        ll.addlast(0);
        ll.printList();
        System.out.println("Mid Value : "+ll.findmid(ll.head).data);

    }
}
