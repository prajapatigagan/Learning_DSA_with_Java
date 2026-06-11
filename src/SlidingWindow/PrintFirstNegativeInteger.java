package SlidingWindow;

public class PrintFirstNegativeInteger {
    public static void PFNI(int nums[],int k){
        for(int i=0; i<=nums.length-k; i++){
            boolean found=false;
            for(int j=i; j<i+k;j++){
                if(nums[j]<0){
                    System.out.println(nums[j]+" ");
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(0 +" ");
            }
        }
    }
        public static void main(String[] args) {
        int nums[]={-8, 2, 3, -6, 10};
        int k=2;
        PFNI(nums,k);
    }
}
