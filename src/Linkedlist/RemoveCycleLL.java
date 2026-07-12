package Linkedlist;

public class RemoveCycleLL {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //detect Cycle..
    public static boolean Iscycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removecycle(Node head){
        //detect Cycle..
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point..
        slow =head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        // Now slow = cycle start
        // Find last node
            Node last = slow;
            while (last.next != slow) {
                last = last.next;
            }

        //remove cycle->last.next=null..
         last.next = null;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(Iscycle(head));
        removecycle(head);
        System.out.println(Iscycle(head));
        Node tempe = head;
        while (tempe != null) {
            System.out.print(tempe.data + "->");
            tempe = tempe.next;
        }
        System.out.println("null");
    }
    
}
