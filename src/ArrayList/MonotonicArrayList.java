package ArrayList;

import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean monotonicarraylist(ArrayList<Integer> list){
        int n=list.size();
        boolean Increasing=true;
        boolean decreasing=true;

        for(int i=0; i<n-1;i++){
            if(list.get(i) > list.get(i+1))
             {
                   Increasing=false;
             }
             if(list.get(i) < list.get(i+1)){
                decreasing=false;
             }

        }
        return Increasing||decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(1);
        list.add(3);
        list.add(2);
        // list.add(3);

        System.out.println(monotonicarraylist(list));
    }
}