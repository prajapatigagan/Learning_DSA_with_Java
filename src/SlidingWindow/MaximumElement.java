package SlidingWindow;

public class MaximumElement {
    public static void MaxElement(int nums[], int k){
        for(int i=0; i<=nums.length-k; i++){
            int max=nums[i];
            for(int j=i; j<i+k;j++){
                if(nums[j]>max){
                    max=nums[j];
                }
            }
            System.out.println(max+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={-8, 2, 3, -6, 10};
        int k=2;
        MaxElement(nums,k);
    }
}
