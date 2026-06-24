package SlidingWindow;

public class numOfSubarrays {
    public static int numofsubarr(int nums[],int k,int threshold){
        int sum=0; 
        for(int i=0; i<k;i++){
            sum+=nums[i];
        }
        int count=0;
        int target=threshold*k;

        if(sum>=target){
            count++;
        }
        for(int i=k; i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>=target){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int nums[]={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;
        System.out.println(numofsubarr(nums, k, threshold));
    }
    
}
