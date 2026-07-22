package GreedyAlgo;

import java.util.*;

public class MaxAbsDiff {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        Integer B[]={6,5,4,3,2,1};

        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());
        int maxdiff=0;

        for(int i=0; i<A.length;i++){
            maxdiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("maxdiff :"+maxdiff);
    }
    
}
