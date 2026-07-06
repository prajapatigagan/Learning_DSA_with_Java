package ArrayList;

import java.util.ArrayList;

public class swapTwoNumber {
    public static void swapnumber(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(8);

        int idx1=2;
        int idx2=6;
        System.out.println(list);
        swapnumber(list, idx1, idx2);
        System.out.println(list);

    }
}
