package Linkedlist;

public class LinkedlistOperation {
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

    public void addFirst(int data){
        //step1:create a node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
            
        //step2:newNode next=head
        newNode.next=head;

        //step3 head=new Node
        head=newNode;
    }
    public void addLast(int data){
        //step1:create a node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2:tail.next=new node
        tail.next=newNode;

        //step3:tail=newNode
        tail=newNode;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedlistOperation ll=new LinkedlistOperation();
        ll.printList();
        ll.addFirst(2);
        ll.printList();
        ll.addFirst(1);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        ll.addFirst(0);
        ll.printList();
    }
}
