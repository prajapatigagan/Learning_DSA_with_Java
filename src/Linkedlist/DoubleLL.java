package Linkedlist;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //addlast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
 
    }

    //remove last
    public static int removeFirst(){
        if(size==0){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    //remove first
    public static int removelast(){
        if(size==0){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        int val = tail.data;      
        tail = tail.prev;       
        tail.next = null;
        size--;
        return val;
    }

    //reverseDoublell
    public void reverseDll(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;   
        }
        tail = head;
        head=prev;
        tail.next = null;

    }
    //printlist
    public static void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");  
    }

    public static void main(String[] args) {
        DoubleLL Dlist=new DoubleLL();
        Dlist.addFirst(3);
        Dlist.addFirst(2);
        Dlist.addFirst(1);
        Dlist.addFirst(0);
        Dlist.addLast(4);
        Dlist.addLast(5);
        Dlist.addLast(6);
        Dlist.printlist();
        Dlist.reverseDll();
        Dlist.printlist();
        System.out.println(size);
        Dlist.removeFirst();
        Dlist.printlist();
        System.out.println(size);
        Dlist.removelast();
        Dlist.printlist();
        System.out.println(size);
        
    }
    
}
