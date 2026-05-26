package Recursion;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumber {
    public static void RemoveDuplicate(int arr[], int n,Set<Integer> set){
        if(n==arr.length){
            System.out.println(set);
            return;
        }
        set.add(arr[n]);
        RemoveDuplicate(arr, n+1,set);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,1,2,3,4,1,3};
        RemoveDuplicate(arr,0,new LinkedHashSet<>());
    }
    
}
