package Hashing_Question;

import java.util.*;
public class ItineraryFormTicket {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revHashMap=new HashMap<>();

        for(String key:tick.keySet()){
            revHashMap.put(tick.get(key),key);
        }
        for(String key:tick.keySet()){
            if(!revHashMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> ticket=new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi" );
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi","Goa");

        String Start=getStart(ticket);

        while(ticket.containsKey(Start)){
            System.out.print(Start+"->");
            Start=ticket.get(Start);
        }
        System.out.println(Start);
    }
}
