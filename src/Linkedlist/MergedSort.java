package Linkedlist;

public class MergedSort {

    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;

        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergell.next;

    }
    public Node mergedSort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);

        //left and right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergedSort(head);
        Node newRight=mergedSort(rightHead);

        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
          MergedSort list = new MergedSort();
        
        list.addLast(2);   
        list.addLast(1);   
        list.addLast(4);  
        list.addLast(3);   
        
        System.out.print("Pehle: ");
        list.printList();  
        
        MergedSort sorter = new MergedSort();
   list.head = sorter.mergedSort(list.head);  
        
        System.out.print("Baad mein: ");
        list.printList(); 
    }
    
}
