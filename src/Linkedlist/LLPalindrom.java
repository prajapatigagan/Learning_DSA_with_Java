package Linkedlist;

public class LLPalindrom {
    public static class Node{
        int data;
        Node Next;

        public Node(int data){
            this.data=data;
            this.Next=null;
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
        tail.Next=newNode;
        tail=newNode;

    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.Next;
        }
        System.out.println("null");
    }

    //Slow-Fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.Next!=null){
            slow=slow.Next;
            fast=fast.Next.Next;
        }
        return slow;
    }
    public boolean CheckPelindom(){
        if(head==null||head.Next==null){
            return true;
        }
        //setp 1:find mid
        Node MidNode=findMid(head);
        //step 2:reverse second mid
        Node prev=null;
        Node curr=MidNode;
        Node next;
        while(curr!=null){
            next=curr.Next;
            curr.Next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left=head;//left half head

        // step 3:check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.Next;
            right=right.Next;
        }
        return true;

    }
    public static void main(String[] args) {
        LLPalindrom ll=new LLPalindrom();
        ll.addlast(0);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        ll.addlast(0);
        ll.printList();
        System.out.println(ll.CheckPelindom());
        System.out.println("Size : "+size);
    }
}
