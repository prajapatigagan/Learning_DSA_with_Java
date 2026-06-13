package SlidingWindow;

public class MaximumAverages {
    public static void MaxAvg(int nums[],int k){
        int sum=0;
        int AvgSum=0;
        for(int i=0; i<k;i++){
            sum+=nums[i];
        }
       
        int maxsum=sum;
        for(int i=k; i<nums.length;i++){
            sum=sum-nums[i-k];
            sum=sum+nums[i];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        double maxAvg = (double) maxsum / k;
        System.out.println(maxAvg);

    }

     public static void main(String[] args) {
        int nums[]={11,12,-5,-6,50,3};
        int k=4;
        MaxAvg(nums,k);
    }
}
