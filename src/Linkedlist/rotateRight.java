package Linkedlist;

public class rotateRight {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node RotateRight(Node head, int k){
        if(head==null||head.next==null||k==0){
            return head;
        }
        // Length nikalo + tail pakdo
        int length=1;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        //Effective rotation
        k=k%length;
        if(k==0){
            return head;
        }
        //rotaion
        tail.next=head;

        // find new tail
        Node newtail=head;
        for(int i=0; i<length-k-1;i++){
            newtail=newtail.next;
        }
        //Break a newhead return 
        Node newhead=newtail.next;
        newtail.next = null;
    
        return newhead;
    }

       static void print(Node h) {
        while (h != null) {
            System.out.print(h.data + (h.next != null ? " -> " : "\n"));
            h = h.next;
        }
    }
    
    public static void main(String[] args) {
        rotateRight list = new rotateRight();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        print(head);
        head = list.RotateRight(head, 2);
        print(head);      
    }     
     
    
}
