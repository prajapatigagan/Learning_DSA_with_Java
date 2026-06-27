package Hashing_Question;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //creation
        HashSet<Integer> set=new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //All print element
        System.out.println("All print element:"+set);

        //size
        System.out.println("size of set is:"+set.size());

        //search-contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
       if(!set.contains(6)){
        System.out.println("set doesnot conatins");
       }

       //delete
       set.remove(1);
       if(!set.contains(1)){
        System.out.println("we deleted 1");
       }
       //Iterator
       Iterator it=set.iterator();
       //hashnext,next function
       while(it.hasNext()){
        System.out.println(it.next());
       }
    }
    
}
