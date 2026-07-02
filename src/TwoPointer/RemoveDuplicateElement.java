package TwoPointer;

public class RemoveDuplicateElement {
    public static int removeduplicateelement(int nums[]){
        int n=nums.length;
        int i=0; 
        int j=1;
        while(j<n){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            else{
                j++;
            }
        }
        return i+1;
       
    }
    
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4,5,5,5};
        System.out.println(removeduplicateelement(nums));

    }
}
