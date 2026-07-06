package ArrayList;

import java.util.*;

public class MaxiMininumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(8);
        int n=list.size();
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
         System.out.println(max);

         //minimum values
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            // if(min>list.get(i)){
            //     min=list.get(i);
            // }
            min=Math.min(min,list.get(i));
        }
        System.out.println(min);
      
    }
    
}
