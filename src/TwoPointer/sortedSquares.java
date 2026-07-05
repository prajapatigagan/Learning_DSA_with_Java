package TwoPointer;

import java.util.Arrays;

public class sortedSquares {
    public static int[] Sequence(int nums[]){
        int n=nums.length;
        int i=0; 
        while(i<n){
            nums[i]=nums[i]*nums[i];
            i++;
        }
        Arrays.sort(nums);

        return nums;
    } 
    public static void main(String[] args) {
        int nums[]={-4,-1,0,4,7,9};
        System.out.println(Arrays.toString(Sequence(nums)));
    }
}
