package Hashing_Question;

import java.util.*;

public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int nums[]={4,5,0,-2,-3,1};
        int k=5;
        
        HashMap<Integer,Integer> map=new HashMap();

        map.put(0, 1);
        int ans=0;
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%2;
            if(rem>=0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                ans+=map.get(rem);
            }
            if(map.containsKey(rem)){
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }
        System.out.println(ans);   
    }  
}
