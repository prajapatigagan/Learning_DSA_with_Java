package ArrayList;

import java.util.ArrayList;

public class BasicOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //Add Element
        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //size.
        // System.out.println(list.size());

        //reverse
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }

        // //Get Element
        // System.out.println(list.get(2));

        // //remove Element
        // list.remove(3);
        // System.out.println(list);

        // //Set Element at Index
        // list.set(3, 6);
        // System.out.println(list);

        //Contains Element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }

    private static boolean list(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
