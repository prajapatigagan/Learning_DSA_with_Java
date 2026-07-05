package ARRAY_QUESTION;

import java.util.*;
public class DuplicateNumber {
     public static int finddulicatenumber(int nums[]){
        Arrays.sort(nums);
        int n=nums.length;
        int result=0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        System.out.println(finddulicatenumber(nums));
    }
}
