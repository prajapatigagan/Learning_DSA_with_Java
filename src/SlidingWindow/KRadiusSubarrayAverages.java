package SlidingWindow;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static int[] getAverages(int[] nums, int k){
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        int windowsize=2*k+1;
        if(windowsize>n){
            return ans;
        }
        long sum=0;
        for(int i=0; i<windowsize; i++){
            sum+=nums[i];
        }
        ans[k]=(int)(sum/windowsize);
         for(int i=windowsize;i<n; i++){
            sum=sum-nums[i-windowsize]+nums[i];
            int center=i-k;
            ans[center]=(int)(sum/windowsize);
         }
         return ans;
    }
    public static void main(String[] args) {
        int nums[]={7,4,3,9,1,8,5,2,6};
        int k=3;
        int []result=getAverages(nums, k);
        for(int i=0; i<nums.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
