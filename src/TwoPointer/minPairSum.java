package TwoPointer;

import java.util.Arrays;

public class minPairSum {
    public static int maxvalue(int nums[]){
        Arrays.sort(nums); 
        int n=nums.length;
        int i=0;
        int j=n-1;
        int result=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            result=Math.max(result, sum);
            i++;
            j--;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={3,5,4,2,4,6};
        System.out.println(maxvalue(nums));
    }
}
