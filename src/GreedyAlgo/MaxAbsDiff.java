package GreedyAlgo;

import java.util.Arrays;

public class MaxAbsDiff {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        int B[]={6,5,4,3,2,1};

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<B.length/2;i++) {
            int temp=B[i];
            B[i]=B[B.length-1-i];
            B[B.length-1-i]=temp;
        }

        int maxdiff=0;

        for(int i=0; i<A.length;i++){
            maxdiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("maxdiff :"+maxdiff);
    }
    
}
