package Linkedlist;

import java.util.LinkedList;

public class UseJavaCollectionFramework {
   public static void main(String[] args) {
     //Create
    LinkedList<Integer> list=new LinkedList<>();

    //Add
    list.addFirst(0);
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    System.out.println(list);
    //Remove
    list.removeFirst();
    list.removeLast();
    System.out.println(list);
   }
}
