package Linkedlist;

public class removeElements {
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
    public Node RemoveElement(int data,Node head){
        Node dummy=new Node(0);
        dummy.next=head;
        Node curr=dummy;
        while(curr.next!=null){
            if(curr.next.data==data){
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        removeElements ll=new removeElements();
        ll.addlast(1);
        ll.addlast(0);
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.printList();
        System.out.println(ll.RemoveElement(0, ll.head));
        ll.printList();
    }
}
