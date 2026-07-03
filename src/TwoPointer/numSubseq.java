package TwoPointer;

public class numSubseq {
    public static int subseq(int nums[],int target){
        int l=0;
        int result=0;
        int n=nums.length;
        int r=n-1;
        int mod = 1000000007;
        int pow[]=new int[n];
        pow[0]=1;

        for(int i=1; i<n; i++){
            pow[i]=(pow[i-1]*2)%mod;
        }
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                result=(result+pow[r-l])%mod;
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={3,5,6,7};
        int target=9;
        System.out.println(subseq(nums, target));
    }
}
