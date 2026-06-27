package Hashing_Question;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        //countary(key),population(values)
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("india",140);
        map.put("us",90);
        map.put("pak",130);
        System.out.println(map);

        //update/reinsert
        map.put("us", 135);
        System.out.println(map);

        //search/lookup
        if(map.containsKey("us")){
            System.out.println("key present in the map");
        }else{
            System.out.println("key does not present in the map");
        }


        System.out.println(map.get("india"));//key exist
        System.out.println(map.get("eng"));//key does not exist

        // use foreach loop for(int val:arr)..
        for(Map.Entry<String,Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //remove
        map.remove("pak");
        System.out.println(map);
    }
    
}
