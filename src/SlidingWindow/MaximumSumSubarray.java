package SlidingWindow;

public class MaximumSumSubarray {
    public static int MaxSumSubArray(int arr[],int k)
    {
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        int max=sum;

        for(int i=k; i<arr.length;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(MaxSumSubArray(arr, k));
    }
    
}
