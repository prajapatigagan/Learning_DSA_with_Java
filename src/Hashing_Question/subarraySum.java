package Hashing_Question;

import java.util.*;


public class subarraySum {
    public static void main(String[] args) {
        int nums[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
    
        map.put(0,1);
        int ans=0; 
        int sum=0;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
    
}
