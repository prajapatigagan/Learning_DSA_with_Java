package ARRAY_QUESTION;

public class findsingleNumber {
    public static int singlenumber(int nums[]){
        int n=nums.length;
        int result=0;
        for (int i = 0; i < n; i++) {
            result=result^nums[i];
            
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,0,1};
        System.out.println(singlenumber(nums));
    }
    
}
