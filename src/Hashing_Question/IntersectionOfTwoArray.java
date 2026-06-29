package Hashing_Question;

import java.util.*;

public class IntersectionOfTwoArray {
    public static int IntersectionTwoArr(int nums1[], int nums2[]){
        int n1=nums1.length;
        int n2=nums2.length;
        int count=0;

        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0; i<n1; i++){
            set.add(nums1[i]);
        }
       for(int j=0; j<n2;j++){
            if(set.contains(nums2[j])){
                count++;
                set.remove(nums2[j]);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int nums1[]={7,3,9};
        int nums2[]={6,3,9,2,9,4};
        System.out.println(IntersectionTwoArr(nums1, nums2));
    }
    
}
