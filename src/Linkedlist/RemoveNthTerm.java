package Linkedlist;

public class RemoveNthTerm {
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

    public void deleteNthTerm(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=0;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind-1){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        RemoveNthTerm ll=new RemoveNthTerm();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.printList();
        System.out.println("Size : "+size);
        ll.deleteNthTerm(2);
         ll.printList();
        System.out.println("Size : "+size);
    }
    
}