package TwoPointer;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    public static int []twosum(int nums[],int target){
        int n=nums.length;
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            sum=nums[i]+nums[j];
            if(target==sum){
                return new int[]{
                    i+1,
                    j+1};    
            }
            else if(sum<target){
                    i++;
                }
            else{
                j--;
            }
        }
        return new int[]{}; 
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twosum(nums,target)));
    }
}
