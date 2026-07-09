package Linkedlist;

public class ReverseLinkedList {
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
        public static int size;
    
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
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

    public void reverseLinkedlist(){
         size++;
        Node curr=head;
        Node prev=tail=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;   
        }
        head=prev;

    }
    
    public static void main(String[] args) {
        ReverseLinkedList ll=new ReverseLinkedList();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.printList();
        ll.reverseLinkedlist();
        ll.printList();
        System.out.println(size);
    }
    
}
