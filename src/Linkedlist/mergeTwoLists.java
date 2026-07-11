package Linkedlist;

public class mergeTwoLists {
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
    public void addLast(int data){
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
        System.out.println("Null");
    }

    public Node MerageLinkedlist(Node list1,Node list2){
        int data = 0;
        Node dummy = new Node(0);
        Node tail=dummy;
        while(list1!=null&&list2!=null){
            if(list1.data<=list2.data){
                tail.next=list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1!=null){
            tail.next=list1;
        }
        else{
            tail.next=list2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        mergeTwoLists list1=new mergeTwoLists();
        System.out.println("list 1");
        list1.addLast(0);
        list1.addLast(1);
        list1.printList();

        mergeTwoLists list2=new mergeTwoLists();
        System.out.println("list 2");
        list2.addLast(2);
        list2.addLast(3);
        list2.printList();

        mergeTwoLists list3=new mergeTwoLists();
        System.out.println("Merged:");
        Node merged = list3.MerageLinkedlist(list1.head, list2.head);
        while (merged != null) {
            System.out.print(merged.data + "->");
            merged = merged.next;
        }
        System.out.println("Null");
    }
}
