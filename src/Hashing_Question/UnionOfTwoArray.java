package Hashing_Question;

import java.util.*;

public class UnionOfTwoArray {
    public static int UnionTwoArr(int nums1[], int nums2[]){
        int n1=nums1.length;
        int n2=nums2.length;

        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0; i<n1; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<n2;i++){
            set.add(nums2[i]);
        }
        return set.size();

    }
    public static void main(String[] args) {
        int nums1[]={7,3,9};
        int nums2[]={6,3,9,2,9,4};
        System.out.println(UnionTwoArr(nums1, nums2));
    }
    
}
