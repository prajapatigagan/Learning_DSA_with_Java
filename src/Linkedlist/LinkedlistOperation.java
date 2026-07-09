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
    public static int size;

    public void addFirst(int data){
        //step1:create a node
        Node newNode=new Node(data);
        size++;
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
        size++;
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

    //add new value
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    //remove first.
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        //prev:i=size-2..
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
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
        ll.add(5, 9);
        ll.add(6, 10);
        ll.printList();
        ll.removefirst();
        ll.printList();
        ll.removelast();
        ll.printList();
        
        System.out.println("Size : "+ll.size);
        

    }
}
