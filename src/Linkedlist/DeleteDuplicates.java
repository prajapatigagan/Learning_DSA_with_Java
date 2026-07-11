package Linkedlist;

public class DeleteDuplicates {
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
    public Node deleteFunction(Node head){
        Node curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        DeleteDuplicates ll=new DeleteDuplicates();
        ll.addlast(0);
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.printList();
        System.out.println(ll.deleteFunction(ll.head));
        ll.printList();
    }
}
