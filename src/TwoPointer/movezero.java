package TwoPointer;

public class movezero {
    public static int MoveZero(int nums[]){
        int i=0;
        int j=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;      
        }
          i++; 
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,5,6,7};
        MoveZero(nums);
         for (int num : nums) {
        System.out.print(num + " ");
    }
    }
    
}
