package ARRAY_QUESTION;

public class MaxValidPairSum {
    public static int maxvalidpairsum(int nums[],int k){
        int n=nums.length;
        int maxleft=0;
        int ans=0;
        for(int i=k;i<n;i++){
            maxleft=Math.max(maxleft, nums[i-k]);
            ans=Math.max(ans,maxleft+nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,2,8};
        int k=2;
        System.out.println(maxvalidpairsum(nums, k));
    }
    
}
