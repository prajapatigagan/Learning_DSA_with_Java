package ArrayList;

import java.util.*;

public class Soring {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(8);

        System.out.println(list);
        //ascending Order
        Collections.sort(list);
        System.out.println(list);

        //disanding Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
